package com.trust.dto;

public class CountryRequest {
	private int id;
	private String countryName;
	public CountryRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryRequest(int id, String countryName) {
		super();
		this.id = id;
		this.countryName = countryName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
	public String toString() {
		return "CountryRequest [id=" + id + ", countryName=" + countryName + "]";
	}
	
	
	
}
