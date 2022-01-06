package com.springpractice1.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpractice1.demo.model.Customer;
import com.springpractice1.demo.repo.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public String createCustomer(Customer customer) {
		customerRepo.save(customer);
		System.out.println("Customer added successfully...");
		return "Customer added successfully with ID: "+ customer.getId();
	}
}
