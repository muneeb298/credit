package com.cg.service;

import java.util.List;


import com.cg.entity.Transaction;

public interface ITransactionService {
	
	public Transaction addTransaction(Transaction transaction);
	public String removeTransaction(int id);
	public Transaction updateTransaction(int id,Transaction transaction);
	public Transaction getTransactionDetails(int id);
	public List<Transaction> getAllTransactions();
	

}
