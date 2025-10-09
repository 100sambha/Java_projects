package com.patient_service.dto;

import com.patient_service.dto.validators.CreatePatientValidationGroup;
import com.patient_service.dto.validators.UpdatePatientValidationGroup;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class PatientRequestDTO {
	
	@NotBlank(message="Name is required")
	@Size(max=100,message="Name cannot exceed 100 character")
	private String name;
	
	@NotBlank(message="Email is required")
	@Email(message = "Email should be valid")
	private String email;
	
	@NotBlank(message="Date of birth is required")
	private String dateOfBirth;
	
	@NotNull(message="Address is required")
	private AddressRequestDTO addressRequestDTO;
	
	public PatientRequestDTO() {
		super();
	}

	public PatientRequestDTO(
			@NotBlank(message = "Name is required") @Size(max = 100, message = "Name cannot exceed 100 character") String name,
			@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email,
			@NotBlank(message = "Date of birth is required") String dateOfBirth,
			@NotNull(message = "Address is required") AddressRequestDTO addressRequestDTO) {
		super();
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.addressRequestDTO = addressRequestDTO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public AddressRequestDTO getAddressRequestDTO() {
		return addressRequestDTO;
	}

	public void setAddressRequestDTO(AddressRequestDTO addressRequestDTO) {
		this.addressRequestDTO = addressRequestDTO;
	}

}