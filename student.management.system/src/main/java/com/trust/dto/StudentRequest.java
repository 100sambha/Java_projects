package com.trust.dto;

import java.time.LocalDate;

public class StudentRequest {
	private int id;
	private String fName;
	private String lName;
	private LocalDate dob;
	private float familyIncome;
	private String concateNumber;
	private LocalDate admissionDate;
	
	private AddressRequest addressRequest;
	private CountryRequest countryRequest;
	private GenderRequest genderRequest;
	private LanguageRequest languageRequest;
	
	public StudentRequest() {
		super();
	}

	public StudentRequest(int id, String fName, String lName, LocalDate dob, float familyIncome, String concateNumber,
			LocalDate admissionDate, AddressRequest addressRequest, CountryRequest countryRequest,
			GenderRequest genderRequest, LanguageRequest languageRequest) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.dob = dob;
		this.familyIncome = familyIncome;
		this.concateNumber = concateNumber;
		this.admissionDate = admissionDate;
		this.addressRequest = addressRequest;
		this.countryRequest = countryRequest;
		this.genderRequest = genderRequest;
		this.languageRequest = languageRequest;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public float getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(float familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getConcateNumber() {
		return concateNumber;
	}

	public void setConcateNumber(String concateNumber) {
		this.concateNumber = concateNumber;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public AddressRequest getAddressRequest() {
		return addressRequest;
	}

	public void setAddressRequest(AddressRequest addressRequest) {
		this.addressRequest = addressRequest;
	}

	public CountryRequest getCountryRequest() {
		return countryRequest;
	}

	public void setCountryRequest(CountryRequest countryRequest) {
		this.countryRequest = countryRequest;
	}

	public GenderRequest getGenderRequest() {
		return genderRequest;
	}

	public void setGenderRequest(GenderRequest genderRequest) {
		this.genderRequest = genderRequest;
	}

	public LanguageRequest getLanguageRequest() {
		return languageRequest;
	}

	public void setLanguageRequest(LanguageRequest languageRequest) {
		this.languageRequest = languageRequest;
	}

	@Override
	public String toString() {
		return "StudentRequest [id=" + id + ", fName=" + fName + ", lName=" + lName + ", dob=" + dob + ", familyIncome="
				+ familyIncome + ", concateNumber=" + concateNumber + ", admissionDate=" + admissionDate
				+ ", addressRequest=" + addressRequest + ", countryRequest=" + countryRequest + ", genderRequest="
				+ genderRequest + ", languageRequest=" + languageRequest + "]";
	}
	
	

}
