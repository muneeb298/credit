package com.cg.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Transaction;
import com.cg.exceptions.TransactionNotFoundException;
import com.cg.repository.ITransactionRepository;
import com.cg.service.ITransactionService;

@Service
public class ITransactionServiceImpl implements ITransactionService {

	@Autowired
	ITransactionRepository transactionRepository;
	
	@Override
	public Transaction addTransaction(Transaction transaction) {
		
		transactionRepository.saveAndFlush(transaction);
		
		return transaction;
	}

	@Override
	public String removeTransaction(int id) {
		
		if(transactionRepository.existsById(id))
		{
			
			Transaction t=transactionRepository.findById(id).get();
			
			transactionRepository.deleteById(id);
			
			return "transaction Removed";
		}
		else {
			
			throw new TransactionNotFoundException("Transaction not found ");
		}
		
	}

	@Override
	public Transaction updateTransaction(int id, Transaction transaction) {
		
		if(!transactionRepository.existsById(id))
		{
			throw new TransactionNotFoundException("Transaction not found ");
		}
		else {
			
		Transaction t=transactionRepository.findById(id).get();
		
		
		return transactionRepository.save(transaction);

		}
	}

	@Override
	public Transaction getTransactionDetails(int id) {
		
		if(!transactionRepository.existsById(id))
		{
			throw new TransactionNotFoundException("Transaction not found ");
		}
		else {

		return transactionRepository.findById(id).get();
		}
	}

	@Override
	public List<Transaction> getAllTransactions() {

		return transactionRepository.findAll();
	}

}
