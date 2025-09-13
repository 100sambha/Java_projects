package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.dao.CustomerInterface;
import com.bank.model.dao.LoginInterface;
import com.bank.model.dao.TrasactionInterface;
import com.bank.model.pojo.Customer;
import com.bank.model.pojo.Login;
import com.bank.model.pojo.TransactionDetails;

@RestController
public class ServerController {
	@Autowired
	CustomerInterface customerInterface;

	@Autowired
	LoginInterface loginInterface;
	
	@Autowired
	TrasactionInterface trasactionInterface;

	@GetMapping("/getAll")
	public List<Customer> getAll() {
		return customerInterface.getAllCustomers();
	}

	@PostMapping("/insertData")
	public String insertUser(@RequestBody Customer c) {
		return customerInterface.newCustomer(c);
	}
	
	@GetMapping("getCustomer/{id}")
	public Customer getCustomer(@PathVariable("id")int id)
	{
		return customerInterface.getCustomer(id);
	}

	@PostMapping("/getUser")
	public Login getUsers(@RequestBody Login l)
	{
		Login user = loginInterface.getByUserName(l.getUsername());
		if (user != null)
		{
			if (user.getUsername().equals(l.getUsername()) && user.getPassword().equals(l.getPassword()) && user.getRole().equals("Admin"))
			{
				return user;
			}
			else if (user.getUsername().equals(l.getUsername()) && user.getPassword().equals(l.getPassword()) && user.getRole().equals("User"))
			{
				return user;
			}
			else
				return null;
		}
		else
			return null;
	}
	
	@PutMapping("updateUser/{id}")
	public String updateUser(@PathVariable("id")int id)
	{
		System.out.println(id);
		String s = customerInterface.updateCustomer(id);
		System.out.println(s);
		return "";
	}
	
	@PutMapping("updateUserBalance")
	public String updateBalance(@RequestBody Customer c)
	{
		System.out.println(c.getBalance());
		customerInterface.updateCustomerBalance(c);
		return "Updated Balance";
	}
	
	@GetMapping("getToCustomer/{accountNo}")
	public Customer getByAccNumber(@PathVariable("accountNo")int accountNo)
	{
		Customer user = customerInterface.getByAccountNo(accountNo);
		return user;		
	}
	
	@PostMapping("insertTransaction")
	public String insertTransact(@RequestBody TransactionDetails tr)
	{
		return trasactionInterface.allTransaction(tr);
		
	}
	
}