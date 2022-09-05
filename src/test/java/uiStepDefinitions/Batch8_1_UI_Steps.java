package uiStepDefinitions;

import java.util.List;

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
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
		String titleText = driver.findElement(By.xpath("//h1[@class='large text-primary']")).getText();
		assertEquals("Sign In",titleText);
		
	}

	@Then("I enter userName {string} and password {string}")
	public void i_enter_user_name_and_password(String username, String password) {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	}
	

	@Then("I am succefully logined")
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
	
	
	
	

}
