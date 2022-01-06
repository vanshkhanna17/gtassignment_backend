package com.springpractice1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice1.demo.model.Loan;
import com.springpractice1.demo.model.Transaction;
import com.springpractice1.demo.repo.LoanRepo;
import com.springpractice1.demo.repo.TransactionRepo;

@Service
public class TransactionService {
	
	@Autowired
	private LoanRepo loanRepo;
	@Autowired
	private TransactionRepo transRepo;
	
	public String createTransForEmi(int loanId) {
		Loan loan = loanRepo.getById(loanId);
		if(loan.getNoOfEmiLeft()>0) {
			loan.setAmountPaid(loan.getAmountPaid()+loan.getEmiAmount());
			loan.setNoOfEmiLeft(loan.getNoOfEmiLeft()-1);
			Transaction trans = new Transaction(loan.getEmiAmount(), loan);
			transRepo.save(trans);
			return "Transaction added successfully with ID: "+ trans.getId();
		}
		else
			return "No EMIs left to be paid";
		}
	
	public String createTransForLumpSum(int loanId, double amount) {
		Loan loan = loanRepo.getById(loanId);
		if((loan.getAmount()-loan.getAmountPaid())>=amount) {
			loan.setAmountPaid(loan.getAmountPaid()+amount);
			loan.setNoOfEmiLeft((loan.getAmount()-loan.getAmountPaid())/loan.getEmiAmount());
			Transaction trans = new Transaction(amount, loan);
			transRepo.save(trans);
			System.out.println("Transaction added successfully...");
			return "Transaction added successfully with ID: "+ trans.getId();
		}
		else
			return "The transaction amount cannot be greater than the balance amount. Balance Amount: "+(loan.getAmount()-loan.getAmountPaid());
				
	}
	
}
