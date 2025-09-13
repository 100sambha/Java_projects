package com.bank.model.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 8,name = "AccNo")
	private int accountNo;
	@Column(length = 15,name = "FName")
	private String fName;
	@Column(length = 15,name = "LName")
	private String lName;
	@Column(length = 10,name = "Mono")
	private String moNo;
	@Column(length = 10,name = "Address")
	private String address;
	@Column(length = 25,name = "Emails")
	private String gmail;
	@Column(length = 13,name = "DOB")
	private String dob;
	@Column(length = 10,name = "Username")
	private String username;
	@Column(length = 10,name = "Password")
	private String password;
	@Column(length = 5,name = "Status")
	private String status;
	private double balance;
	
	public Customer() {}

	public Customer(int id, int accountNo, String fName, String lName, String moNo, String address, String gmail,
			String dob, String username, String password, String status,double balance) {
		this.id = id;
		this.accountNo = accountNo;
		this.fName = fName;
		this.lName = lName;
		this.moNo = moNo;
		this.address = address;
		this.gmail = gmail;
		this.dob = dob;
		this.username = username;
		this.password = password;
		this.status = status;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}