package com.patient_service.dto;

public class PatientResponseDTO {
	private String id;
	private String name;
	private AddressResponseDTO addressDTO;
	
	public PatientResponseDTO() {
		super();
	}
	
	public PatientResponseDTO(String id, String name, AddressResponseDTO addressDTO) {
		super();
		this.id = id;
		this.name = name;
		this.addressDTO = addressDTO;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressResponseDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressResponseDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
}