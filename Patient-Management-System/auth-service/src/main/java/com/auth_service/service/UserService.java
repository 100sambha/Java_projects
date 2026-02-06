package com.auth_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.auth_service.entity.User;
import com.auth_service.repo.UserRepository;

@Service
public class UserService {
	

	
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;

	}

	public Optional<User> findByEmail(String email) {
		Optional<User> user = userRepository.findByEmail(email);
		return user;
	}
}
