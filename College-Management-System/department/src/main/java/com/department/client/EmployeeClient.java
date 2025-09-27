package com.department.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.employee.model.Employee;

@HttpExchange
public interface EmployeeClient {
	
	@GetExchange("/employee/getByDepartment/{department}")
	public List<Employee> getByDepartment(@PathVariable("department") Long department);

}
