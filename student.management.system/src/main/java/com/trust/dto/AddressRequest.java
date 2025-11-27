package com.trust.dto;

public class AddressRequest {
	private int id;
	private String city;
	public AddressRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddressRequest(int id, String city) {
		super();
		this.id = id;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "AddressRequest [id=" + id + ", city=" + city + "]";
	}
	
	

}
