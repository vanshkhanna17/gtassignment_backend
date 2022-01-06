package com.springpractice1.demo.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="loans")
public class Loan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="custID")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "loan")
	private List<Transaction> trans;
	
	public Loan() { }

	public Loan(double principle, double rateOfInterest, double time, double intrest, double amount, double emiAmount,
			double noOfEmi, Customer customer) {
		super();
		this.principle = principle;
		this.rateOfInterest = rateOfInterest;
		this.time = time;
		this.intrest = intrest;
		this.amount = amount;
		this.emiAmount = emiAmount;
		this.noOfEmi = noOfEmi;
		this.amountPaid = 0.0;
		this.noOfEmiLeft = noOfEmi;
		this.customer = customer;
		this.trans = new ArrayList<Transaction>();
	}


	public Loan(int id, double principle, double rateOfInterest, double time, double intrest, double amount,
			double emiAmount, double noOfEmi, double amountPaid, double noOfEmiLeft, Customer customer,
			List<Transaction> trans) {
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
		this.customer = customer;
		this.trans = trans;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Transaction> getTrans() {
		return trans;
	}

	public void setTrans(List<Transaction> trans) {
		this.trans = trans;
	}
	

}

