package com.springpractice1.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice1.demo.model.Ledger;
import com.springpractice1.demo.service.LedgerService;

@RestController
public class LedgerController {
	
	@Autowired
	private LedgerService ledgerService;
	
	@GetMapping("/bank/ledger/{loanId}")
	public Ledger getLedger(@PathVariable int loanId){
		return ledgerService.getLedgerForLoan(loanId);
	}
	
}
