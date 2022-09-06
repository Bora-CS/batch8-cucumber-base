package apiStepDefinitions;

import java.util.HashMap;

import java.util.Map;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APISteps_batch8_1 {


	String token;
	int educationStatusCode;
	int experienceStatusCode;
	
	@Then("[API] I signIn by API by userName {string} and password {string}")
	public void api_i_sign_in_by_api_by_user_name_and_password(String userName, String password) {

		// 1. set up request
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification request = RestAssured.given();

		// 2. Set up header
		request.header("Content-Type", "application/json");

		// 3. Set up body
		HashMap<String, String> body = new HashMap<>();
		body.put("email", userName);
		body.put("password", password);

		request.body(body);

		// 4. Do a API call
		Response resp = request.post("/api/auth");

		token = resp.getBody().jsonPath().get("token");

	}

	@Then("[API] Add a experence for the user")
	public void api_add_a_experence_for_the_user(DataTable dataTable) {

		// 1. set up request
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification request = RestAssured.given();

		// 2. Set up header
		request.header("Content-Type", "application/json");
		request.header("x-auth-token",token);
		
		// 3. Set up body
		Map<String, String> data =	dataTable.asMaps().get(0);
		request.body(data);

		// 4. Do a API call
		Response resp = request.put("/api/profile/experience");
		experienceStatusCode = resp.getStatusCode();

	}

}
