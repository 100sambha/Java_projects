package com.auth_service.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.auth_service.dto.LoginRequestDTO;
import com.auth_service.dto.LoginResponseDTO;
import com.auth_service.service.AuthService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@Tag(name = "Auth-Service", description = "Auth service login and token validate request")
public class AuthController {
	
	final private AuthService authService;
	
	public AuthController(AuthService authService ) {
		this.authService = authService;
	}

	@Operation(description = "Generate user log in token")
	@PostMapping("/login")
	public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO) {
		Optional<String> optionalToken = authService.authenticate(loginRequestDTO);
		if(optionalToken.isEmpty()) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		String token = optionalToken.get();
		return ResponseEntity.ok(new LoginResponseDTO(token));
	}
	
	@Operation(description = "Validate Token")
	@GetMapping("/validate")
	public ResponseEntity<Void> validateToken(@RequestHeader("Authorization") String authHeader) {
		
		if(authHeader==null || !authHeader.startsWith("Bearer ")) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		
		String token = authHeader.substring(7);
		return authService.validateToken(token)
				? ResponseEntity.ok().build()
				: ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
	}
}