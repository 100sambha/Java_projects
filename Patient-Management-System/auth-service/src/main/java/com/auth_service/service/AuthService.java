package com.auth_service.service;

import java.util.Optional;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth_service.dto.LoginRequestDTO;
import com.auth_service.util.JwtUtil;

import io.jsonwebtoken.JwtException;

@Service
public class AuthService {
	
	private final UserService userService;
	private final PasswordEncoder encoder;
	private final JwtUtil jwtUtil;
	
	public AuthService(UserService userService, PasswordEncoder encoder, JwtUtil jwtUtil) {
		this.jwtUtil = jwtUtil;
		this.userService = userService;
		this.encoder = encoder;
	}
	
	public Optional<String> authenticate(LoginRequestDTO loginRequestDTO) {
		
		Optional<String> token = userService.findByEmail(loginRequestDTO.getEmail())
				.filter(u->encoder.matches(loginRequestDTO.getPassword(), u.getPassword()))
				.map(u->jwtUtil.generateToken(u.getEmail(),u.getRole()));
		
		return token;
		
	}

	public boolean validateToken(String token) {
		try {
			jwtUtil.validateToken(token);
			return true;
		} catch (JwtException e) {
			return false;
		}
	}

}
