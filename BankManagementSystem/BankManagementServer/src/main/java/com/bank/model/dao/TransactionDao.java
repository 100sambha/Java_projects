package com.bank.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.pojo.TransactionDetails;

@Service
public class TransactionDao implements TrasactionInterface
{
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public TransactionDetails depositAmmount(int id,double ammount) {
		return null;
	}

	@Override
	public TransactionDetails withdrawAmmount(int id,double ammount) {
		return null;
	}

	@Override
	public TransactionDetails fundTransfer(int id,int senderAccNo, int receiverAccNo, double Ammount) {
		return null;
	}

	@Override
	public TransactionDetails GetBalance(int id,int accountNo) {
		return null;
	}

	@Override
	public String allTransaction(TransactionDetails tr) {
		transactionRepository.save(tr);
		return "Transaction success";
	}	
}