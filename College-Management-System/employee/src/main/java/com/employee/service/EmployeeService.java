package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;

	public String addNewEmployee(Employee employee) {
		try {
			employeeRepo.save(employee);
			return "Created record for employee";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public Employee findByEmployeeId(long employeeId) {
		try {
			System.out.println(employeeId);
			Employee employee = employeeRepo.findByEmployeeId(employeeId);
			System.out.println(employee);
			return employee;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}

	public List<Employee> getAllEmployeeByType(String type) {
		return employeeRepo.findByType(type);
	}

	public List<Employee> getAllEmployeeByDeparment(String department) {
		return employeeRepo.findByDepartmentId(department);
	}

	public List<Employee> getByDepartmentOrType(String department, String type) {
//		return employeeRepo.findByDepartmentIdAndType(department,type);
		return employeeRepo.findByDepartmentIdOrType(department,type);
	}

}
