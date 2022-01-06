package com.springpractice1.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice1.demo.model.Ledger;
import com.springpractice1.demo.model.Loan;
import com.springpractice1.demo.model.Transaction;
import com.springpractice1.demo.model.Transactions;
import com.springpractice1.demo.repo.LoanRepo;
import com.springpractice1.demo.repo.TransactionRepo;

@Service
public class LedgerService {

	@Autowired
	private LoanRepo loanRepo;
	@Autowired
	private TransactionRepo transRepo;
	
	public Ledger getLedgerForLoan(int loanId){
		Loan loan = loanRepo.getById(loanId);
		List<Transaction> trans = transRepo.findAllByLoan(loan);
		List<Transactions> transactionList = new ArrayList<Transactions>();
		for(Transaction t: trans) {
			transactionList.add(new Transactions(t.getId(), t.getDate(), t.getAmountPaid()));
		}
		Ledger ledger = new Ledger(transactionList, loan.getAmount()-loan.getAmountPaid(), loan.getEmiAmount(), loan.getNoOfEmiLeft());
		return ledger;
	}
	
}
