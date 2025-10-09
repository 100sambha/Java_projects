package com.patient_service.service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.patient_service.dto.PatientRequestDTO;
import com.patient_service.dto.PatientResponseDTO;
import com.patient_service.exception.EmailAlreadyExistException;
import com.patient_service.exception.PatientNotFoundException;
import com.patient_service.mapper.PatientMapper;
import com.patient_service.model.Address;
import com.patient_service.model.Patient;
import com.patient_service.repository.PatientRepository;

@Service
public class PatientService {

	private PatientRepository patientRepository;
	
	Log logger = LogFactory.getLog(PatientService.class.getName());

	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}

	public List<PatientResponseDTO> getAllPatient() {
		List<Patient> patients = patientRepository.findAll();

		return patients.stream().map(patient -> PatientMapper.toDTO(patient)).collect(Collectors.toList());

	}

	public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
		if (patientRepository.existsByEmail(patientRequestDTO.getEmail())) {
			throw new EmailAlreadyExistException(
					"Email already used by another patient :" + patientRequestDTO.getEmail());
		} else {
			Patient newPatient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
			PatientResponseDTO patientResponseDTO = PatientMapper.toDTO(newPatient);
			logger.info(patientResponseDTO);
			return patientResponseDTO;
		}
	}

	public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO patientRequestDTO) {

		Patient patient = patientRepository.findById(id)
				.orElseThrow(() -> new PatientNotFoundException("Patient not found with ID: " + id));

		if (patientRepository.existsByEmailAndIdNot(patientRequestDTO.getEmail(),id)) {
			throw new EmailAlreadyExistException(
					"A patient with this email " + "already exists - " + patientRequestDTO.getEmail());
		}

		patient.setName(patientRequestDTO.getName());
		patient.setEmail(patientRequestDTO.getEmail());
		patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));

		Address address = new Address();
		address.setCity(patientRequestDTO.getAddressRequestDTO().getCity());
		address.setState(patientRequestDTO.getAddressRequestDTO().getState());
		address.setCountry(patientRequestDTO.getAddressRequestDTO().getCountry());
		patient.setAddress(address);

		Patient updatedPatient = patientRepository.save(patient);
		return PatientMapper.toDTO(updatedPatient);
	}
	
	
	public void deletePatient(UUID id) {
		patientRepository.deleteById(id);
	}
}