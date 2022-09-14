package uiStepDefinitions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.DashboardPage2;
import pages.HomePage2;
import pages.LoginPage2;
import utilities.DriverFactory;

public class LoginWithPOMStepDefinitions {

	private WebDriver driver;
	private HomePage2 homePage;
	private LoginPage2 loginPage;
	private DashboardPage2 dashboardPage;

	@Before
	public void setup() {
		driver = DriverFactory.getInstance();

	}

	@After
	public void teardown() {
		DriverFactory.cleanup();

	}

	@Given("[POM] user is on the homepage")
	public void pom_user_is_on_the_homepage() {
		homePage = new HomePage2(driver);
		homePage.navigate();
		}
		
	

	@Given("[POM] user clicks on the login link button")
	public void pom_user_clicks_on_the_login_link_button() {

		homePage.clickOnLoginLink();

	}

	@When("[POM] user enters email and password")
	public void pom_user_enters_email_and_password(DataTable dataTable) {
		Map<String, String> credentials = dataTable.asMaps().get(0);
		loginPage = new LoginPage2(driver);
		loginPage.enterEmailAndPassword(credentials.get("email"), credentials.get("password"));

	}

	@When("[POM] user clicks the submit login button")
	public void pom_user_clicks_the_submit_button() throws InterruptedException {
	loginPage.submitLogin();

	}

	@Then("[POM] user should be on the dashboard page")
	public void pom_user_should_be_on_the_dashboard_page() {
		WebElement subtitle = driver.findElement(By.xpath("//p[@class = 'lead']"));
		assertTrue(subtitle.getText().contains("welcome"), "Sign In Failed");

		dashboardPage = new DashboardPage2(driver);
		dashboardPage.validatePageLoad();
	}

}
