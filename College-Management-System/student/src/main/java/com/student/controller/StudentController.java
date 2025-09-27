package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/newStudent")
	public void addStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
	
	@GetMapping("/getStudent/{rollnumber}/{dept}")
	public Student getStudent(@PathVariable int rollnumber, @PathVariable int dept) {
		Optional<Student> student = studentService.getStudent(rollnumber, dept);
		if(student.isPresent()) {			
			return student.get();
		}
		return null;
	}
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PutMapping("/updateStudentYear/{rollnumber}/{dept}")
	public String updateStudentYear(@PathVariable int rollnumber, @PathVariable int dept, @RequestParam int year) {

		System.out.println(getStudent(rollnumber, dept));
		int status = studentService.updateYear(rollnumber, dept, year);
		if(status==1) {
			return "Student goes to next year successfully";
		}
		return "Student not Found With Given Id and Department";
	}
	
}
