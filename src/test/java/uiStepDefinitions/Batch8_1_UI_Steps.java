package uiStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Batch8_1_UI_Steps {
	WebDriver driver = Driver

@Given("I am on the homepage")
public void i_am_on_the_homepage() {
	driver.get("https://boratech.herokuapp.com/");
}
@Given("I click login button")
public void i_click_login_button() {
 driver.findElement(By.linkText("Login")).click();;
}
@Then("Login page is displayed")
public void login_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("this is a helper message");
}

@Then("I enter useName\"clmusic333@gmail.com\"and password\"Mymom0608&\"")
public void i_enter_use_name_clmusic333_gmail_com_and_password_mymom0608() {
    // Write code here that turns the phrase above into concrete actions
	  System.out.println("this is a helper message");
}

@Then("I am succefully logined")
public void i_am_succefully_logined() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("this is a helper message");
}

	
	
	
	
	
	
	
	
	
	

}
