package com.patient_service.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.patient_service.model.Patient;

import patient_events.PatientEvent;

@Service
public class KafkaProducer {

	private final KafkaTemplate<String, byte[]> kafkaTemplate;
	
	public KafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendEvent(Patient patient) {
		PatientEvent event = PatientEvent.newBuilder()
				.setPatientId(patient.getId().toString())
				.setName(patient.getName())
				.setEmail(patient.getEmail())
				.setEventType("PATIENT_CREATED")
				.build();
		try {
			this.kafkaTemplate.send("patient-service",event.toByteArray());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}