package com.springpractice1.demo.model;

import java.util.List;

//Data Transfer Object
public class Ledger {

	private List<Transactions> transactions;
	private double balanceAmount;
	private double emiAmount;
	private double noEmiLeft;
	
	public Ledger() {
		
	}

	public Ledger(List<Transactions> transactions, double balanceAmount, double emiAmount, double noEmiLeft) {
		super();
		this.transactions = transactions;
		this.balanceAmount = balanceAmount;
		this.emiAmount = emiAmount;
		this.noEmiLeft = noEmiLeft;
	}

	public List<Transactions> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transactions> transactions) {
		this.transactions = transactions;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getNoEmiLeft() {
		return noEmiLeft;
	}

	public void setNoEmiLeft(double noEmiLeft) {
		this.noEmiLeft = noEmiLeft;
	}
	
	
}

