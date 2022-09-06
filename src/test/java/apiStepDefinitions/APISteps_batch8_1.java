package apiStepDefinitions;

import java.util.HashMap;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APISteps_batch8_1 {

	// 1.set up request
	RestAssured.baseURI="https://boratech.herokuapp.com/";
	RequestSpecification request = RestAssured.given();
	// 2. Set up header
	request.header("Conten-Type","application/json");
	// 3.Set up body
	HashMap<String, String> body = new HashMap<>();
	body.put("email",userName);
	body.put("password",password);

	request.body(body);

	// do a API call
	Response resp = request.post("/api/auth");

	token=resp.getBody().jsonPath().get("token");

}

	@Then("[API] Add a experence for the user")
	public void api_add_a_experence_for_the_user() {

		// 1.set up request
		RestAssured.baseURI = "https://boratech.herokuapp.com/";
		RequestSpecification request = RestAssured.given();
		//2.Set up header
		request.header("Conten-Type","application/json");
		request.header("x-auth-token", "token");
		//3.Set up body
		
		
		
	}

}