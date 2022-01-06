package com.springpractice1.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpractice1.demo.model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}
