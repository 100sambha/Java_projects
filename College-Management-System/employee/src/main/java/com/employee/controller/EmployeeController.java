package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/newEmployee")
	public String addNewEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		String result = employeeService.addNewEmployee(employee);
		return result;
	}
	
	@GetMapping("/getEmployee/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") long employeeId) {
		System.out.println(employeeId);
		Employee employee = employeeService.findByEmployeeId(employeeId);
		return employee;
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee() {
		List<Employee> employees = employeeService.getAllEmployee();
		return employees;
	}
	
	@GetMapping("/getByType")
	public List<Employee> getByType(@RequestParam("type") String type) {
		List<Employee> employeesByType = employeeService.getAllEmployeeByType(type);
		return employeesByType;
	}
	
	@GetMapping("/getByDepartment/{department}")
	public List<Employee> getByDepartment(@PathVariable("department") String department) {
		System.out.println("------------------"+department);
		List<Employee> employeesByDepartment = employeeService.getAllEmployeeByDeparment(department);
		return employeesByDepartment;
	}
	
	@GetMapping("/getByDepartmentOrType")
	public List<Employee> getByDepartmentOrType(@RequestParam("department") String department,@RequestParam("type") String type) {
		List<Employee> employeesByDepartment = employeeService.getByDepartmentOrType(department,type);
		return employeesByDepartment;
	}
}