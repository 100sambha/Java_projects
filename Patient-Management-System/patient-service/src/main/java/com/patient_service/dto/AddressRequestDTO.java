package com.patient_service.dto;

import jakarta.validation.constraints.NotBlank;

public class AddressRequestDTO {
	
	@NotBlank(message = "City is required")
	private String city;
	@NotBlank(message = "State is required")
	private String state;
	@NotBlank(message = "Country is required")
	private String country;

	public AddressRequestDTO() {
		super();
	}
	
	public AddressRequestDTO(@NotBlank(message = "City is required") String city,
			@NotBlank(message = "State is required") String state,
			@NotBlank(message = "Country is required") String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	
}