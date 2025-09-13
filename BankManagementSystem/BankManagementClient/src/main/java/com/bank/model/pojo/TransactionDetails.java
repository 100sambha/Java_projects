package com.bank.model.pojo;

public class TransactionDetails
{
	private int id;
	private String transId;
	private String Date;
	private Double credit;
	private Double debit;
	private Double Balance;
	
	public TransactionDetails() {}
	
	public TransactionDetails(int id, String transId, String date, Double credit, Double debit, Double balance)
	{
		super();
		this.id = id;
		this.transId = transId;
		Date = date;
		this.credit = credit;
		this.debit = debit;
		Balance = balance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Double getCredit() {
		return credit;
	}
	public void setCredit(Double credit) {
		this.credit = credit;
	}
	public Double getDebit() {
		return debit;
	}
	public void setDebit(Double debit) {
		this.debit = debit;
	}
	public Double getBalance() {
		return Balance;
	}
	public void setBalance(Double balance) {
		Balance = balance;
	}
}