package com.springpractice1.demo.model;

//Data Transfer Object
public class LoanRequest {

	private int custId;
	private double roi;
	private double time;
	private double principle;
	
	public LoanRequest() {}
	
	public LoanRequest(int custId, double roi, double time, double principle) {
		super();
		this.custId = custId;
		this.roi = roi;
		this.time = time;
		this.principle = principle;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}
	
	
}
