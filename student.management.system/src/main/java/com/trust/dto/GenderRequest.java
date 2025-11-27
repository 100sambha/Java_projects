package com.trust.dto;

public class GenderRequest {
	private int id;
	private String gender;
	public GenderRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GenderRequest(int id, String gender) {
		super();
		this.id = id;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "GenderRequest [id=" + id + ", gender=" + gender + "]";
	}
	
	
}
