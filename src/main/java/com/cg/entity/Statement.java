package com.cg.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Statement{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long statementId;
	@Min(value=1000,message="Dueamount should be greater than 1000")
	private double dueAmount;
	private LocalDate billingDate;
	private LocalDate dueDate;
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="customerId")
    @JsonIgnore
	public Customer customers;
	
	public Statement() {}

	public long getStatementId() {
		return statementId;
	}

	public void setStatementId(long statementId) {
		this.statementId = statementId;
	}

	public double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Customer getCustomers() {
		return customers;
	}

	public void setCustomers(Customer customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", dueAmount=" + dueAmount + ", billingDate=" + billingDate
				+ ", dueDate=" + dueDate + ", customers=" + customers + "]";
	}

	public Statement(long statementId,
			@Min(value = 1000, message = "Dueamount should be greater than 1000") double dueAmount,
			LocalDate billingDate, LocalDate dueDate, Customer customers) {
		super();
		this.statementId = statementId;
		this.dueAmount = dueAmount;
		this.billingDate = billingDate;
		this.dueDate = dueDate;
		this.customers = customers;
	}
	
	
	
	

}
