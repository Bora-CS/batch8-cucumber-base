package apiStepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import api.BoraAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import pojo.Experience;

import static utilities.ConstantVariables.*;
import static org.testng.Assert.*;

public class APIProfile extends BoraAPI {

	@Given("[API] the user has aquired the token using the following credentials:")
	public void api_the_user_has_aquired_the_token_using_the_following_credentials(DataTable inputs) {

		Map<String, String> credentials = inputs.asMaps().get(0);
		String token = BoraAPI.login(credentials.get("username"), credentials.get("password"));

		RestAssured.baseURI = boraTechBaseUri;
		request = RestAssured.given();
		request.header("x-auth-token", token);

	}

	@DataTableType
	public Experience experienceInputs(Map<String, String> input) {

		return new Experience(input.get("title"), input.get("company"), input.get("location"), input.get("from"),
				input.get("current"), input.get("to"), input.get("discription"));
	}

	@Then("[API] user adds an experience with incomplete field\\(s)")
	public void api_user_adds_an_experience_with_incomplete_field_s(List<Experience> experiences) {

		response = request.body(experiences).put(apiAddExperienceEndPoint);
	}

	@Then("[API] user is unable to add experience because they recieved {int} error\\(s)")
	public void api_user_is_unable_to_add_experience_because_they_recieved_error_s(Integer numberOfErrors,
			DataTable listOfErrors) {

		ArrayList<String> actualErrors = response.jsonPath().get(apiErrorMsg);

		int count = 0;
		List<String> expectedErrors = listOfErrors.asList();
		for (int i = 0; i < actualErrors.size(); i++) {
			if (actualErrors.get(i).equals(expectedErrors.get(i))) {
				count++;
			}
		}
		assertEquals(count, numberOfErrors);
	}

	@Then("[API] user recieves status code {int}")
	public void api_user_recieves_status_code(Integer expectedStatusCode) {
		int actualStatusCode = response.statusCode();
		assertEquals(actualStatusCode, expectedStatusCode);
	}

}
