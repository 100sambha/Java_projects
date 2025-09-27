package com.patient_service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodValidationException(MethodArgumentNotValidException ex) {
		
		Map<String, String> errors = new HashMap<>();
		
		ex.getBindingResult().getFieldErrors().forEach(error->errors.put(error.getField(), error.getDefaultMessage()));
		
		return ResponseEntity.badRequest().body(errors);
	}
	
	@ExceptionHandler(EmailAlreadyExistException.class)
	public ResponseEntity<Map<String, String>> handleExistEmailException(EmailAlreadyExistException ex){
		Map<String, String> errors = new HashMap<>();
		
		errors.put("Message", ex.getMessage());
		
		return ResponseEntity.badRequest().body(errors);
	}
	
	
	@ExceptionHandler(PatientNotFoundException.class)
	public ResponseEntity<Map<String, String>> hanldePatientNotFoundException(PatientNotFoundException ex) {
		Map<String, String> errors = new HashMap<>();
		errors.put("message", ex.getMessage());
		
		return ResponseEntity.badRequest().body(errors);
	}
}