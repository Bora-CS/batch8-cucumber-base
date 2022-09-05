package uiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmallClass {
	

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("This is helper message");
	}
	@Given("Click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("Login page is displayed")
	public void login_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("I enter userName {string} and password {string}")
	public void i_enter_user_name_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Username is :" + username+"\nPassword is :"+password);
	}
	@Then("I an succefully logined")
	public void i_an_succefully_logined() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I am succefully logined")
	public void i_am_succefully_logined() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
