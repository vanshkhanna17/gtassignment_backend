package com.springpractice1.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice1.demo.model.LoanRequest;
import com.springpractice1.demo.model.TransactionRequest;
import com.springpractice1.demo.service.LoanService;
import com.springpractice1.demo.service.TransactionService;

@RestController
public class LoanAndTransactionController {

	@Autowired
	private LoanService loanService;
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping("/bank/loan")
	public Map<String, String> createLoan(@RequestBody LoanRequest loanReq) {
		return loanService.createLoan(loanReq.getCustId(), loanReq.getRoi(), loanReq.getTime(), loanReq.getPrinciple());
	}
	
	@PostMapping("/bank/transaction/emi")
	public String createTransForEmi(@RequestBody TransactionRequest transReq) {
		return transactionService.createTransForEmi(transReq.getLoanId());
	}
	
	@PostMapping("/bank/transaction/lumpsum")
	public String createTransForLumpSum(@RequestBody TransactionRequest transReq) {
		return transactionService.createTransForLumpSum(transReq.getLoanId(), transReq.getAmount());
	}
	
}
