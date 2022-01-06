package com.springpractice1.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpractice1.demo.model.Loan;
import com.springpractice1.demo.model.Transaction;



@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer>{
	List<Transaction> findAllByLoan(Loan loan);
}
