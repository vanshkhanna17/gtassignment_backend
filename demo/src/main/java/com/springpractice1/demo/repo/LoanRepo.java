package com.springpractice1.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpractice1.demo.model.Customer;
import com.springpractice1.demo.model.Loan;


@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer>{
	List<Loan> findAllByCustomer(Customer customer );
}
