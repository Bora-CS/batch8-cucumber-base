package uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Practice1 {

	@Given("user is on the boratech login page")
	public void user_is_on_the_boratech_login_page() {
		System.out.println("Step 1 - User is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Step 2 - User is on the login page");
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		System.out.println("Step 3 - User is on the login page");
	}

	@Then("user should be navigated to the Dashboard page")
	public void user_should_be_navigated_to_the_dashboard_page() {
		System.out.println("Step 3 - User is on the login page");
	}

}
