package com.analytical_service.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import patient_events.PatientEvent;

@Service
public class KafkaConsumer {
	
	@KafkaListener(topics = "patient-service", groupId = "analytical-service")
	public void consumeEvent(byte[] patientEvent) {
		try {
			PatientEvent event = PatientEvent.parseFrom(patientEvent);
			System.out.println(event);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}