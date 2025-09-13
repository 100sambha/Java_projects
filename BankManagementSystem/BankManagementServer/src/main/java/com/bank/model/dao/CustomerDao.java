package com.bank.model.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.pojo.Customer;
import com.bank.model.pojo.Login;

@Service
public class CustomerDao implements CustomerInterface {
	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	LoginRepository loginRepository;

	@Override
	public String newCustomer(Customer customer) {
		customerRepository.save(customer);
		return "Thanks for Registration";
	}

	@Override
	public Customer getCustomer(int id) {
		Optional<Customer> C = customerRepository.findById(id);
		if (C.isPresent())
			return C.get();
		else
			return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> l = customerRepository.findAll();
		return l;
	}

	@Override
	public String updateCustomer(int customerid) {
		Optional<Customer> c = customerRepository.findById(customerid);
		c.get().setStatus("A");
		Customer c2 = c.get();
		customerRepository.save(c2);
		Login login = new Login();
		login.setId(c2.getId());
		login.setUsername(c2.getUsername());
		login.setPassword(c2.getPassword());
		login.setRole("User");
		login.setStatus("A");
		loginRepository.save(login);
		return "updated";
	}

	@Override
	public String updateCustomerBalance(Customer c)
	{
		customerRepository.save(c);
		return "Updated Balance";
	}
	
	@Override
	public Customer getByAccountNo(int accountNo) {
		Customer c = customerRepository.findByAccountNo(accountNo);
		return c;
	}
}