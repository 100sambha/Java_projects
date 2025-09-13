package com.bank.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.pojo.Login;

@Service
public class LoginDao implements LoginInterface
{

	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public Login loginExistingUser(String username, String password)
	{
		return null;
	}

	@Override
	public Login getByUserName(String username) {
		return loginRepository.findByUsername(username);
	}
}