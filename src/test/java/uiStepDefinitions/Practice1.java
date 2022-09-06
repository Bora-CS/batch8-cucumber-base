package uiStepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DriverFactory;

public class Practice1 {

	private WebDriver driver = DriverFactory.getInstance();

	@Given("user is on the boratech login page")
	public void navigateToLoginPage() {
		driver.get("https://boratech.herokuapp.com");
		
	}

	@When("user enters username - {string} and password - {string}")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Given("user is logged in")
	public void user_is_logged_in(DataTable dataTable) throws InterruptedException {
		Map<String, String> credentials = dataTable.asMaps().get(0);
		driver.get("https://boratech.herokuapp.com/login");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(credentials.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentials.get("password"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}
}