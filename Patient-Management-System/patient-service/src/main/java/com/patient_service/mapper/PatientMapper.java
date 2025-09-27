package com.patient_service.mapper;

import java.time.LocalDate;

import com.patient_service.dto.AddressResponseDTO;
import com.patient_service.dto.PatientRequestDTO;
import com.patient_service.dto.PatientResponseDTO;
import com.patient_service.model.Address;
import com.patient_service.model.Patient;

public class PatientMapper {
	
	public static PatientResponseDTO toDTO(Patient patient) {
		
		AddressResponseDTO addressDTO = new AddressResponseDTO();
		addressDTO.setCity(patient.getAddress().getCity());
		addressDTO.setState(patient.getAddress().getState());
		addressDTO.setCountry(patient.getAddress().getCountry());
		
		PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
		patientResponseDTO.setId(patient.getId().toString());
		patientResponseDTO.setName(patient.getName());
		
		patientResponseDTO.setAddressDTO(addressDTO);
		
		return patientResponseDTO;
	}

	public static Patient toModel(PatientRequestDTO patientRequestDTO) {
		Patient patient = new Patient();
		patient.setName(patientRequestDTO.getName());
		patient.setEmail(patientRequestDTO.getEmail());
		patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
		patient.setRegisteredDate(LocalDate.now());
		
		Address address = new Address();
		address.setCity(patientRequestDTO.getAddressRequestDTO().getCity());
		address.setState(patientRequestDTO.getAddressRequestDTO().getState());
		address.setCountry(patientRequestDTO.getAddressRequestDTO().getCountry());
		patient.setAddress(address);
		
		return patient;
	}

}
