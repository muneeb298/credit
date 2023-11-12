package com.cg.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.cg.entity.Payment;
import com.cg.exceptions.PaymentNotFoundException;
import com.cg.repository.IPaymentRepository;
import com.cg.service.IPaymentService;

@Service
public class IPaymentServiceImpl implements IPaymentService {

	@Autowired
	IPaymentRepository paymentrepository;

	Payment pmt;

	@Override
	public Payment addPayment(Payment payment) {
		
		paymentrepository.save(payment);
		
		return payment;
	}

	@Override
	public Payment removePayment(long id) {
		
		paymentrepository.deleteById(id);
		
		System.out.println("Payment removed successfully");
		
		return pmt;
	}

	@Override
	public Payment updatePayment(long id, Payment payment) {
		
		if (paymentrepository.existsById(payment.getPaymentId())) {

			return paymentrepository.save(payment);

		} else {

			throw new PaymentNotFoundException();
		}
	}

	@Override
	public Payment getPayment(long id) {
		
		if(paymentrepository.existsById(id)) {
			
		return paymentrepository.findById(id).get();
	}
		else {
			throw new PaymentNotFoundException();
		}

}
}
