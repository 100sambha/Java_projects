package com.bank.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.model.pojo.TransactionDetails;

public interface TransactionRepository extends JpaRepository<TransactionDetails, Integer>
{
}