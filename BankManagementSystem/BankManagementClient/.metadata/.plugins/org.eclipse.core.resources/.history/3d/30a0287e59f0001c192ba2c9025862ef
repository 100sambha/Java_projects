package com.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.bank.model.pojo.Customer;
import com.bank.model.pojo.Login;

@Controller
@SessionAttributes({""})
public class CustomerController
{
	@Autowired
	RestTemplate restTemplate;
	
	static String url = "http://localhost:5050/";
	
	@RequestMapping("/")
	public String getHome(Model M) {
		return "Home";
	}
	@RequestMapping("/login")
	public String loginUser(Model M)
	{
		return "Login";
	}
	
	
	@RequestMapping("/register")
	public String registerUser(Model M) {
		return "Register";
	}

	@RequestMapping("/addUser")
	public String addData(Model M,@ModelAttribute("obj") Customer c )
	{
		int accno = (int) (Math.random()*99999999);
		c.setAccountNo(accno);
		c.setStatus("P");
		c.setBalance(0);
		String st = restTemplate.postForObject(url+"insertData",c, String.class);
		M.addAttribute("c", st);
		return "Register";
	}
	
	@RequestMapping("/logedin")
	public String login(@ModelAttribute Login l,Model m,HttpServletRequest h)
	{
		HttpSession session=h.getSession();
		Login users = restTemplate.postForObject(url + "getUser", l, Login.class);
		if(users!=null)
		{
			session.setAttribute("user", l.getUsername());
			session.setAttribute("Id", users.getId());
			if(users.getRole().equals("Admin"))
			{
				Customer[] customer = restTemplate.getForObject(url + "getAll", Customer[].class);
				m.addAttribute("customer", customer);
				return "Admin";
			}
			else
			{
				Customer customer = restTemplate.getForObject(url + "getCustomer/"+users.getId(), Customer.class);
				m.addAttribute("user", customer);
				return "info";
			}
		}
		m.addAttribute("msg", "Please Enter Correct Username/Password");
		return "Login";
	}
}