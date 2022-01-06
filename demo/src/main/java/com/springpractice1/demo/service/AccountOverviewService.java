package com.springpractice1.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice1.demo.model.AccountOverview;
import com.springpractice1.demo.model.Customer;
import com.springpractice1.demo.model.Loan;
import com.springpractice1.demo.repo.CustomerRepo;
import com.springpractice1.demo.repo.LoanRepo;

@Service
public class AccountOverviewService {
	
	@Autowired
	private CustomerRepo customerRepo;
	@Autowired
	private LoanRepo loanRepo;
	
	public List<AccountOverview> getAccountOverviewForCustomer(int custId){
		Customer customer = customerRepo.getById(custId);
		List<AccountOverview> accountOverviewList = new ArrayList<AccountOverview>();
		List<Loan> loans = loanRepo.findAllByCustomer(customer);
		for(Loan l:loans) {
			accountOverviewList.add(new AccountOverview(l.getId(), l.getPrinciple(), l.getRateOfInterest(), l.getTime(), l.getIntrest(), l.getAmount(), l.getEmiAmount(), l.getNoOfEmi(), l.getAmountPaid(), l.getNoOfEmiLeft(), l.getTrans().size()));
		}
		return accountOverviewList;
	}
}
