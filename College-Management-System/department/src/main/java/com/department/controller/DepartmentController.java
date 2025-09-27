package com.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.client.EmployeeClient;
import com.department.model.Department;
import com.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@Autowired
	private EmployeeClient employeeClient;
	
	@PostMapping("/newDepartment")
	public String addDepartment(@RequestBody Department department) {
		return departmentService.addNewDepartment(department);
	}
	
	
	@GetMapping("/getAllDepartments")
	public List<Department> getAllDepartments() {
		return departmentService.getAllDepartments();
	}
	
	
	@GetMapping("/getAllDepartmentsWithEmployees")
	public List<Department> getAllDepartmentsWithEmployees() {
		List<Department> departments = departmentService.getAllDepartments();
		departments.forEach(department->department.setEmployees(employeeClient.getByDepartment(department.getDepartmentId())));
		return departments;
	}

}
