package com.bank.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.pojo.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>
{
	Login findByUsername(String username); 
}