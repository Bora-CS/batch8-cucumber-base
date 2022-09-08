package apiStepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import api.BoraAPI;

public class APIStepDefinitions {

	public String token;
	
	@Given("[API] user is logged in")
	public void apiLogin(DataTable dataTable) {
		Map<String, String> credential = dataTable.asMaps().get(0);
		String token = BoraAPI.login(credential.get("username"), credential.get("password"));
		System.out.println("Token: " + token);
	}
	@Then("[API] user adds an experience")
	public void api_user_adds_an_experience(io.cucumber.datatable.DataTable dataTable) {
	   Map<String,String> experienceInput = dataTable.asMaps().get(0);
	   Map<String,Object> experience  =  new HashMap<>();
	   
	   for(Entry<String, String> entry : experienceInput.entrySet()) {
		   if(entry.getKey().equals("current")) {
			   experience.put(entry.getKey(),Boolean.getBoolean(entry.get(0));
		   } else if (entry.getKey().equals("title")) {
			   experience.put(entry.getKey(),entry.getValue() + Utilities)
		   } else {
			   experience.put(entry.getKey(),entry.getValue());
		   }
	   }
		
	}

}