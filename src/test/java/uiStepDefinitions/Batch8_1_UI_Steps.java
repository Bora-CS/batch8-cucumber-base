package uiStepDefinitions;

import java.time.Duration;
import java.util.List;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DriverFactory;
import utilities.DriverFactory_batch8_1;

public class Batch8_1_UI_Steps {
	
	private WebDriver driver = DriverFactory_batch8_1.setUpDriver();

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {
		driver.get("https://boratech.herokuapp.com/");
		
	}

	@Given("Click login button")
	public void click_login_button() throws InterruptedException {
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
=======
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DriverFactory_batch8_1;

public class Batch8_1_UI_Steps{

	WebDriver driver = DriverFactory_batch8_1.setUpDriver();

	@Given("I am on the homepage")
	public void i_am_on_the_homepage() {

		driver.get("https://boratech.herokuapp.com/");

	}

	@Given("Click login button")
	public void click_login_button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

		driver.findElement(By.linkText("Login")).click();
		
		driver = DriverFactory_batch8_1.setUpDriver();
>>>>>>> batch8.1_Master
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
<<<<<<< HEAD
		String titleText = driver.findElement(By.xpath("//h1[@class='large text-primary']")).getText();
		assertEquals("Sign In",titleText);
		
=======

		List<WebElement> elems = driver.findElements(By.xpath("//h1[text()='Sign In']"));
		Assertions.assertTrue(elems.size() > 0, "We didn't land on the Login Page");

>>>>>>> batch8.1_Master
	}

	@Then("I enter userName {string} and password {string}")
	public void i_enter_user_name_and_password(String username, String password) {
<<<<<<< HEAD
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
=======
		System.out.println("Username is: " + username + "\nPassword is: " + password);
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
>>>>>>> batch8.1_Master
		
	}
	

	@Then("I am succefully logined")
<<<<<<< HEAD
	public void i_am_succefully_logined() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
DriverFactory_batch8_1.cleanUpDriver();
	}
	
//	
//	@Then("I enter wrong credential")
//	public void i_enter_wrong_credential(io.cucumber.datatable.DataTable dataTable) {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//	     
//	  List<List<String> >user =	dataTable.asLists();
//	    
//	    for(List<String> value: user  ) {
//	    	for(String v : value) {
//	    		System.out.println("Value is: "+v);
//	    	}
//	    }
//
//	}
//	
//	@Then("I am NOT able to login")
//	public void i_am_not_able_to_login() {
//	   System.out.println("This is NOT able to login message");
//	}
//	
	
	
	
	
=======
	public void i_am_succefully_logined() {
		
		System.out.println("I am able to login");
		DriverFactory_batch8_1.cleanUpDriver();

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
>>>>>>> batch8.1_Master

}
