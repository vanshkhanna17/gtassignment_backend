package com.springpractice1.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private Date date;
	private double amountPaid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="loanID")
	private Loan loan;
	
	public Transaction() { }

	public Transaction(double amountPaid, Loan loan) {
		super();
		this.date = new Date();
		this.amountPaid = amountPaid;
		this.loan = loan;
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

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	
	
}

