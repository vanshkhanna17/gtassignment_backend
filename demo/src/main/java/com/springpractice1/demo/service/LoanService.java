package com.springpractice1.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice1.demo.model.Customer;
import com.springpractice1.demo.model.Loan;
import com.springpractice1.demo.repo.CustomerRepo;
import com.springpractice1.demo.repo.LoanRepo;

@Service
public class LoanService {
	
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private LoanRepo loanRepo;
	public Map<String, String> createLoan(int custId, double roi, double time, double principle) {
		double intr = (principle*time*roi)/100;
		double amt = principle+intr;
		double noEmi = time*12;
		double emiAmt = amt/noEmi;
		Customer customer = customerRepo.getById(custId);
		Loan loan = new Loan(principle, roi, time, intr, amt, emiAmt, noEmi, customer);
		loanRepo.save(loan);
		Map<String, String> response = new HashMap<String, String>();
		response.put("Loan ID", Integer.toString(loan.getId()));
		response.put("Amount to be paid", Double.toString(loan.getAmount()));
		response.put("EMI Amount", Double.toString(loan.getEmiAmount()));
		return response;
	}
	
}
