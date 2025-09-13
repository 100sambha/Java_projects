package com.bank.model.dao;

import java.util.List;

import com.bank.model.pojo.Customer;

public interface CustomerInterface
{	
	String newCustomer(Customer customer);
	
	Customer getCustomer(int id);
	
	List<Customer> getAllCustomers();
	
	String updateCustomer(int customer);
	
	String updateCustomerBalance(Customer c);
	
	Customer getByAccountNo(int accountNo);
}