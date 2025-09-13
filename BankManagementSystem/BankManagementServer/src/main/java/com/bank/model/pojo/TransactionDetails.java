package com.bank.model.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction")
public class TransactionDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int indexId;
	private int id;
	@Column(length = 15,name = "TransactionId")
	private String transId;
	@Column(length = 15,name = "TxDate")
	private String Date;
	@Column(length = 15,name = "CreditAmm")
	private Double credit;
	@Column(length = 15,name = "DebitAmm")
	private Double debit;
	@Column(length = 15,name = "Balance")
	private Double Balance;
	
	public TransactionDetails() {}
	
	public TransactionDetails(int indexId,int id, String transId, String date, Double credit, Double debit, Double balance)
	{
		super();
		this.indexId = indexId;
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
	public int getIndexId() {
		return indexId;
	}
	public void setIndexId(int indexId) {
		this.indexId = indexId;
	}
}