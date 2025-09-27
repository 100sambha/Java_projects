package com.employee.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "Employee")
@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	private long employeeId;
	private String name;
	private String email;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss:SSS")
	private Date dob;
	private String departmentId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss:SSS")
	private Date joiningDate;
	private String address;
	private double salary;
	private String contactNumber;
	private String emergencyContactNumber;
	private String gender;
	private String type;
}