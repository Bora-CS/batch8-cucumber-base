package apiStepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import java.util.Map;

import api.BoraAPI;

public class APILogin {

	public static String token;

	@Given("[API] user is logged in")
	public void apiLogin(DataTable dataTable) {
		Map<String, String> credential = dataTable.asMaps().get(0);
		token = BoraAPI.login(credential.get("username"), credential.get("password"));
		System.out.println("Token: " + token);
	}

}
