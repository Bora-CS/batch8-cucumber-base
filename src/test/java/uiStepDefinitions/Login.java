package uiStepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import utilities.PageManager;

public class Login {

	PageManager pages = PageManager.getInstance();

	@Given("user is on the boratech login page")
	public void navigateToLoginPage() {
		pages.getLoginPage().navigate();
	}

	@When("user enters username - {string} and password - {string}")
	public void user_enters_username_and_password(String username, String password) {
		pages.getLoginPage().enterEmailAndPassword(username, password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
		pages.getLoginPage().submitLogin();
	}

	@Given("user is logged in")
	public void user_is_logged_in(DataTable dataTable) {
		pages.getDashboardPage().validatePageLoad();
	}
}