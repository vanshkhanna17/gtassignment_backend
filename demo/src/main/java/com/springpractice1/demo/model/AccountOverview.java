package com.springpractice1.demo.model;

//Data Transfer Object
public class AccountOverview {
	
	private int id;
	private double principle;
	private double rateOfInterest;
	private double time;
	private double intrest;
	private double amount;
	private double emiAmount;
	private double noOfEmi;
	private double amountPaid;
	private double noOfEmiLeft;
	private int noOfTransactionsDone;
	
	public AccountOverview() {}

	public AccountOverview(int id, double principle, double rateOfInterest, double time, double intrest, double amount,
			double emiAmount, double noOfEmi, double amountPaid, double noOfEmiLeft, int noOfTransactionsDone) {
		super();
		this.id = id;
		this.principle = principle;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
		this.intrest = intrest;
		this.amount = amount;
		this.emiAmount = emiAmount;
		this.noOfEmi = noOfEmi;
		this.amountPaid = amountPaid;
		this.noOfEmiLeft = noOfEmiLeft;
		this.noOfTransactionsDone = noOfTransactionsDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}

	public double getNoOfEmi() {
		return noOfEmi;
	}

	public void setNoOfEmi(double noOfEmi) {
		this.noOfEmi = noOfEmi;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getNoOfEmiLeft() {
		return noOfEmiLeft;
	}

	public void setNoOfEmiLeft(double noOfEmiLeft) {
		this.noOfEmiLeft = noOfEmiLeft;
	}

	public int getNoOfTransactionsDone() {
		return noOfTransactionsDone;
	}

	public void setNoOfTransactionsDone(int noOfTransactionsDone) {
		this.noOfTransactionsDone = noOfTransactionsDone;
	}
	
	
	
}
