package apiStepDefinitions;

import java.util.Map;

import api.BoraAPI;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class Profile extends BoraAPI{
	
	 final static int expectedUnhappyStatusCode = 400;
	
	@Then("user enters incorrect add experience inputs")
	public void user_enters_incorrect_add_experience_inputs(DataTable dataTable) {
		Map<String, String> experience = dataTable.asMaps().get(0);
		request.header("x-auth-token", login("lixiasun2000@gmail.com", "Lsun1688"));
	   response = request.body(experience.keySet()).put("/api/profile/experience");

	}

	@Then("user gets back error\\(s)")
	public void user_gets_back_error_s(DataTable dataTable) {
		Map<String, String> errors = dataTable.asMaps().get(0);
		response = request.body(errors.keySet()).get("/api/profile/experience");
		
	   
	}

}
