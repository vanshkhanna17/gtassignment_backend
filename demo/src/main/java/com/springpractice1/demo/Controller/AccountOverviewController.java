package com.springpractice1.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice1.demo.model.AccountOverview;
import com.springpractice1.demo.service.AccountOverviewService;

@RestController
public class AccountOverviewController {
	
	@Autowired
	private AccountOverviewService accountOverviewService;
	@GetMapping("/bank/accountOverview/{custId}")
	public List<AccountOverview> getLoans(@PathVariable int custId){
		return accountOverviewService.getAccountOverviewForCustomer(custId);
	}
	
}
