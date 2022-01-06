package com.springpractice1.demo.model;

import java.util.Date;

//Data Transfer Object
public class Transactions {

	private int id;
	private Date date;
	private double amount;
	
	public Transactions() {}

	public Transactions(int id, Date date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
