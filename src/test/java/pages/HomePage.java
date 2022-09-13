package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	private By headerLoginLink = By.linkText("Login");
	private By headerRegisterLink = By.linkText("Register");
	private By headerApplyNowLink = By.linkText("Apply Now");
	 
	private final String url = "https://boratech.herokuapp.com/";
	 
	 
	 public HomePage(WebDriver passedDriver) {
		 this.driver = passedDriver;
		 
	 }
	 public void navigateToHomePage() {
		 driver.get(url);
	 }
	 
	 
	
	public void clickLoginBottion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

		driver.findElement(headerLoginLink).click();

	}
	
	
	public void clickRegisterButton() {
		driver.findElement(headerRegisterLink).click();
		
	}
	
	public void clickApplyNOWButton() {
		driver.findElement(headerApplyNowLink).click();
	}
	
}
