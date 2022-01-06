package com.springpractice1.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springpractice1.demo.model.Customer;
import com.springpractice1.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/bank/customer")
	public String createCustomer(@RequestBody Customer customer) {
		return customerService.createCustomer(customer);
	}
	
}
