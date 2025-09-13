package com.bank.model.dao;


import com.bank.model.pojo.Login;

public interface LoginInterface
{
	Login loginExistingUser(String username, String password);
	
	Login getByUserName(String username);
}