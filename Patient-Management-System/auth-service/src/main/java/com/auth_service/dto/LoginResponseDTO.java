package com.auth_service.dto;

public class LoginResponseDTO {
	
	private String token;

	public LoginResponseDTO(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
