package com.trust.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trust.dto.StudentRequest;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@PostMapping()
	public String createStudent(@RequestBody StudentRequest request) {
		System.out.println(request.toString());
		return "Created";		
	}
	
	@PutMapping("/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody StudentRequest request) {
		return "Updated";
	}
	
	@GetMapping()
	public String getAllStudent() {
		return "get all";
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {
		return "deleted";
	}
}