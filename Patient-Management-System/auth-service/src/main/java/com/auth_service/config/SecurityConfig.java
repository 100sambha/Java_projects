package com.auth_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth
//		        .requestMatchers("/login", "/validate", "/h2-console/**","/v3/api-docs/**"));
		        .anyRequest().permitAll());
//		        .anyRequest().authenticated());
		
	    http.csrf(AbstractHttpConfigurer::disable);
	    
	    http.headers(headers -> headers.frameOptions(frame -> frame.disable()));
	    
	    return http.build();
	}
	
	@Bean
	public PasswordEncoder encoder()
	{
		return new BCryptPasswordEncoder();
	}
}
