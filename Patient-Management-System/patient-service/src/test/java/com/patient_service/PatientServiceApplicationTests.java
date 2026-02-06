package com.patient_service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.patient_service.dto.AddressRequestDTO;
import com.patient_service.dto.AddressResponseDTO;
import com.patient_service.dto.PatientRequestDTO;
import com.patient_service.dto.PatientResponseDTO;
import com.patient_service.service.PatientService;

//(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest
public class PatientServiceApplicationTests {

//	@BeforeAll
//	void setUp() {
//		RestAssured.baseURI = "http://localhost:8090";
//	}
//
//	@Test
//	void sampleTest() {
//
//		String patientRequest = """
//							{
//								"name":"shankar",
//								"email":"test@gmail.com",
//								"dateOfBirth":"2025-02-02",
//								"addressRequestDTO":{
//								    "city":"Nagar",
//								    "state":"Mah",
//								    "country":"Bharat"
//								}
//							}
//							""";
//
//		Response response = RestAssured.given()
//				.contentType("application/json")
//				.body(patientRequest)
//				.when()
//				.put("/patient/update/72b0da01-9fe4-41ad-af72-541a5ea8acd6")
//				.then()
//				.statusCode(200)
//				.body("$", Matchers.notNullValue())
//				.extract()
//				.response();
//
//		System.out.println(response.jsonPath().prettyPrint());
//	}

	@Autowired
	private PatientService service;


	@Test
	void createPatientWithSuccess() {
		PatientRequestDTO request = new PatientRequestDTO("sambhaji", "100sambha@gmail.com", "2015-02-10",
				new AddressRequestDTO("Pune", "MH", "IN"));
		PatientResponseDTO response = service.updatePatient(UUID.fromString("72b0da01-9fe4-41ad-af72-541a5ea8acd6"), request);

		assertEquals("sambhaji", response.getName());
		assertEquals(response.getAddressDTO().getCity(), "Pune");
//		assertEquals(response, service.createPatient(request));
	}
}
