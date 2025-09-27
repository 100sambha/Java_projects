package com.department.model;

import java.util.List;

import com.employee.model.Employee;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "Department")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "employees") // Avoid infinite recursion in toString
public class Department{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    
    private String name;
    
    @ElementCollection
    @Transient
    private List<Employee> employees;

}
