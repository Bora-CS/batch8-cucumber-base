package apiStepDefinitions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.Education;

public class APIProfile {
	private String token = APILogin.token;
	private String endpoint;
	RequestSpecification request = RestAssured.given();;
	Response response;

	@When("[API] user sets the endpoint and the header to add an {string}")
	public void api_user_sets_the_endpoint_and_the_header_to_add_profile(String educationOrExperience) {
		RestAssured.baseURI = "https://boratech.herokuapp.com";
		endpoint = "/api/profile/" + educationOrExperience;
		request.header("Content-Type", "application/json");
		request.header("x-auth-token", token);
	}

	@When("[API] user calls the PUT request with education data with missing information")
	public void api_usr_calls_the_put_resquest_with_education_data_with_missing_information(DataTable dataTable) {
		Map<String, String> education = dataTable.asMaps().get(0);
		Education body = new Education(education.get("id"), education.get("school"), education.get("degree"),
				education.get("fieldofstudy"), education.get("from"), education.get("current"), education.get("to"),
				education.get("description"));
		request.body(body);
		response = request.put(endpoint);
	}

	@Then("[API] user should fail and get status code {int}")
	public void api_user_should_fail_and_get_a_status_code(Integer expectedStatusCode) {
		int actualStatusCode = response.getStatusCode();
		assertEquals(expectedStatusCode, actualStatusCode);
	}

	@Then("[API] user gets {int} error messages: {string}")
	public void api_user_gets_error_messages(Integer numberOfErrorMsg, String errorMsg) {
		ArrayList<String> actualErrorMessages = response.jsonPath().get("errors.msg");
		assertEquals(numberOfErrorMsg, actualErrorMessages.size());
		String[] expectedErrorMessages = errorMsg.split(", ");
		for (int i = 0; i < actualErrorMessages.size(); i++) {
			assertEquals(expectedErrorMessages[i], actualErrorMessages.get(i));
		}
	}
}
