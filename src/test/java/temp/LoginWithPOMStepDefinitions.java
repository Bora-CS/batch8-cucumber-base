package temp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import utilities.DriverFactory;
import utilities.PageManager;

public class LoginWithPOMStepDefinitions {

	private WebDriver driver;
	private PageManager pages = PageManager.getInstance();

	@Before
	public void setUp() {
		driver = DriverFactory.getInstance();
	}
	@After
	public void teardown() {
		DriverFactory.cleanup();
	}
	
	
	@Given("[POM] user is on the homepage")
	public void pom_user_is_on_the_homepage() {
		WebDriver driver = DriverFactory.getInstance();
		driver.get("https://boratech.herokuapp.com/");
	}

	@Given("[POM] user clicks on the login link button")
	public void pom_user_clicks_on_the_login_link_button() {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
	}

	@When("[POM] user enters email and password")
	public void pom_user_enters_email_and_password(DataTable dataTable) {
		Map<String, String> credentials = dataTable.asMaps().get(0);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(credentials.get("email"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentials.get("password"));
	}

	@When("[POM] user clicks on submit login button")
	public void pom_user_clicks_on_submit_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	}

	@Then("[POM] user should be on the dashboard page")
	public void pom_user_should_be_on_the_dashboard_page() {
		WebElement subtitle = driver.findElement(By.xpath("//p[@class='lead']"));
		assertTrue(subtitle.getText().contains("Welcome"), "Sign In Failed");
	}

}
