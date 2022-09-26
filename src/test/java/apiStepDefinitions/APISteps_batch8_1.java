package apiStepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
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
		RestAssured.baseURI = "https://boratech.herokuapp.com/";
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
	
	@When("[API] user create or update the profile")
	public void api_user_create_or_update_the_profile(HashMap<String, String> bodyData) {
	    
		// 1. Set up request
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		RequestSpecification request = RestAssured.given();
		
		
		// 2. Set up header
		request.header("Content-Type", "application/json");
		request.header("x-auth-token", token);
		
		// 3. Set up body
//		List<List<String>> datas = table.asLists();
//		HashMap<String, String> bodyData = new HashMap<>();
//		
//		for(List<String> rowData : datas) {
//			bodyData.put(rowData.get(0), rowData.get(1));
//			System.out.println("Each line of data is: "+rowData);
//		}
		request.body(bodyData);
		
		
		// 4. Do an API call
		Response resp = request.post("api/profile");
		
		
		int actualStatusCode = resp.getStatusCode();
		
		String body = resp.getBody().asPrettyString();
		
		System.out.println("API Status is: "+actualStatusCode);
		System.out.println("API body is: "+body);
		
	}
	@Then("[API] validete the prifle for the user")
	public void api_validete_the_prifle_for_the_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
