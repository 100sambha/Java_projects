package com.auth_service;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

@SpringBootTest
class AuthServiceApplicationTests {

	@BeforeAll
	static void setUp() {
		RestAssured.baseURI = "http://localhost:8098";
	}

	@Test
	public void shouldReturnOkWithValidToken() {
		
		String payload = """
					{
						"email":"testuser@test.com",
						"password":"test"
					}
				""";
		
		Response response = RestAssured.given()
				.contentType("application/json")
				.body(payload)
				.when()
				.post("/login")
				.then()
				.statusCode(200)
				.body("token", Matchers.notNullValue())
				.extract()
				.response();

		System.out.println("Generated Token :- "+response.jsonPath().getString("token"));
	}
	
	@Test
	public void shouldReturnUnAuthorizedLogin() {
		String payload = """
				{
					"email":"invalid_user@test.com",
					"password":"test"
				}
				""";
		
		RestAssured.given()
			.contentType("application/json")
			.body(payload)
			.when()
			.post("/login")
			.then()
			.statusCode(401);
	}
}
