package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Optional<Student> getStudent(int rollnumber, int dept) {
		Optional<Student> student = studentRepository.getStudentByRollNumber(rollnumber, dept);
		return student;
	}

	public int updateYear(int rollnumber, int dept, int year) {
		int status = studentRepository.updatestudYear(rollnumber,dept,year);
		return status;
		
	}

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
