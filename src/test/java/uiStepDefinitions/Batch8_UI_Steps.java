package uiStepDefinitions;

import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DriverFactory;

public class Batch8_UI_Steps {

	private WebDriver driver = DriverFactory.getInstance();

	@Given("user is on the boratech login page")
	
	@Then("I enter username {string} and password {string}")
	public void i_enter_username_and_password(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("I am succefully logged in")
	public void i_am_succefully_logged_in() throws InterruptedException {
		String actualmessage = driver.findElement(By.xpath("//*[@class='lead']")).getText();
		String expectedmessage = "Welcome carter";

		Assertions.assertEquals(expectedmessage, actualmessage, "test fails");
		Thread.sleep(2000);
	}

}
