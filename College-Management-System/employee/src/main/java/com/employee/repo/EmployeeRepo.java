package com.employee.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {

	Employee findByEmployeeId(long employeeId);

	List<Employee> findByType(String type);

	List<Employee> findByDepartmentId(String department);

//	List<Employee> findByDepartmentIdAndType(String department, String type);	
	List<Employee> findByDepartmentIdOrType(String department, String type);	
}