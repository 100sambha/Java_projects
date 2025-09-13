package com.bank.model.dao;

import com.bank.model.pojo.TransactionDetails;

public interface TrasactionInterface
{
	TransactionDetails depositAmmount(int id,double ammount);
	
	TransactionDetails withdrawAmmount(int id,double ammount);
	
	TransactionDetails fundTransfer(int id,int senderAccNo, int receiverAccNo,double Ammount);
	
	TransactionDetails GetBalance(int id,int accountNo);
	
	String allTransaction(TransactionDetails tr);
}