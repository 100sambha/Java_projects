package com.bank.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.pojo.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
	Customer findByAccountNo(int accountNo);
}