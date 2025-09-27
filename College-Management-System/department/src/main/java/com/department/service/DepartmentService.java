package com.department.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.model.Department;
import com.department.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepo departmentRepo;
	
	public String addNewDepartment(Department department) {
		try {
			departmentRepo.save(department);
			return "Department Created Successfull";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	
	public List<Department> getAllDepartments() {
		return departmentRepo.findAll();
	}

}
