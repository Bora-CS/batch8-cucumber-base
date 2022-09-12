package uiStepDefinitions;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.LoginPage;
import utilities.DriverFactory_batch8_1;

public class Batch8_1_UI_Steps{

	WebDriver driver = DriverFactory_batch8_1.setUpDriver();
	HomePage homePage = new HomePage(driver);
	LoginPage login;

	@Before
	public void statTest() {
		driver = DriverFactory_batch8_1.setUpDriver();
		homePage = new HomePage(driver);
		login = new LoginPage(driver);
	}
	@After
	public void endTest() {
		DriverFactory_batch8_1.cleanUpDriver();
		
	}
	
	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {

		driver.get("https://boratech.herokuapp.com/");

	}

	@Given("Click login button")
	public void click_login_button() {
		HomePage homePage = new HomePage(driver);
		
		homePage.clickLoginBottion();
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {

		boolean isDisplay = login.verifyLoginPageDisplay();
		Assertions.assertTrue(isDisplay, "We didn't land on the Login Page");

	}

	@Then("I enter userName {string} and password {string}")
	public void i_enter_user_name_and_password(String username, String password) {
		System.out.println("Username is: " + username + "\nPassword is: " + password);
		
		login.login(username,password);
		login.enterEmailAddress(password);
		login.clickLoginButton();
		
	}

	@Then("I am succefully logined")
	public void i_am_succefully_logined() throws InterruptedException {
		Thread.sleep(3000);
		
		boolean amIinlogin = login.verifyLoginPageDisplay();
		
		Assertions.assertFalse(amIinlogin,"I am still in the Login page");
		
		System.out.println("I am able to login");
		

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

		List<List<String>> user = dataTable.asLists();

		for (List<String> value : user) {
			for (String v : value) {
				System.out.println("Value is: " + v);
			}
		}

	}

	@Then("I am NOT able to login")
	public void i_am_not_able_to_login() {
		System.out.println("This is NOT able to login message");
		DriverFactory_batch8_1.cleanUpDriver();

	}

}
