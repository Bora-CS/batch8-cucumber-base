package uiStepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Batch8_1_UI_Steps {

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is helper message");
	}

	@Given("Click login button")
	public void click_login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is helper message");

	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is helper message");

	}

	@Then("I enter userName {string} and password {string}")
	public void i_enter_user_name_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Username is: "+username+"\nPassword is: "+password);
	}

	@Then("I am succefully logined")
	public void i_am_succefully_logined() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is helper message");

	}
	
	
	@Then("I enter wrong credential")
	public void i_enter_wrong_credential(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	     
	  List<List<String> >user =	dataTable.asLists();
	    
	    for(List<String> value: user  ) {
	    	for(String v : value) {
	    		System.out.println("Value is: "+v);
	    	}
	    }

	}
	
	@Then("I am NOT able to login")
	public void i_am_not_able_to_login() {
	   System.out.println("This is NOT able to login message");
	}
	
	
	
	
	

}
