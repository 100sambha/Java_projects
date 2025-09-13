package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.bank.model.pojo.Customer;


@Controller
public class LoginController {
	@Autowired
	RestTemplate restTemplate;

	static String url = "http://localhost:5050/";
	
	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam("status") String c,Model m)//,@RequestParam("Id")
	{
		String[] str = c.split("-");
		int id = Integer.parseInt(str[1]);
		System.out.println(id);
		String s = restTemplate.exchange(url+"updateUser/"+id, HttpMethod.PUT, new HttpEntity<>(id), String.class).getBody();
		System.out.println(s);
		Customer[] customer = restTemplate.getForObject(url + "getAll", Customer[].class);
		m.addAttribute("customer", customer);
		return "Admin";
	}
}