package com.bank.model.pojo;

public class Customer
{
	private int id;
	private int accountNo;
	private String fName;
	private String lName;
	private String moNo;
	private String address;
	private String gmail;
	private String dob;
	private String username;
	private String password;
	private String status;
	private double balance;
	
	public Customer() {}

	public Customer(int id, int accountNo, String fName, String lName, String moNo, String address, String gmail,
			String dob, String username, String password, String status,double balance) {
		super();
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