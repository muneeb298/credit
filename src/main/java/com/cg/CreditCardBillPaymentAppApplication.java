package com.cg;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.entity.Account;
import com.cg.entity.Customer;
import com.cg.repository.ICustomerRepository;



@SpringBootApplication
public class CreditCardBillPaymentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardBillPaymentAppApplication.class, args);
		}
}

		
		
		/*public void run(String...args)throws Exception{
			
			ICustomerRepository customerRepository = null;
			
			Customer customer1=new Customer(6639798,"Seetha","seetha@yahoo.com","8862960136",LocalDate.parse("2000-07-23"),"Hyderabad");
			Customer customer2=new Customer(5876978,"Rani","Rani@yahoo.com","88629658136",LocalDate.parse("2000-08-23"),"Hyderabad");
			
			Account account1=new Account(576387298,"SBI account",50000.00,"savings");
			Account account2=new Account(576365869,"Central bank account",20000.00,"current");
			
			customer1.getAccountlist().add(account1);
			customer1.getAccountlist().add(account2);
			
			customer2.getAccountlist().add(account1);
			customer2.getAccountlist().add(account2);
			
			customerRepository.save(customer1);
			customerRepository.save(customer2);
			
			
			
			
		
	}
}*/


