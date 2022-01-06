package com.springpractice1.demo.model;

//Data Transfer Object
public class TransactionRequest {
	
	private int loanId;
	private double amount;
	
	public TransactionRequest() {
		
	}

	public TransactionRequest(int loanId, double amount) {
		super();
		this.loanId = loanId;
		this.amount = amount;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
}
