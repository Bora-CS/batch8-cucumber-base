package pages;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	
	private WebDriver driver;
	
	
	// pageName _ Function/ElementType _ shortDescription
	private By headerText_singIn = By.xpath("//h1[text()='Sign In']");
	private By emailField = By.name("email");
	private By passwordField = By.name("password");
	private By loginButton = By.xpath("//input[@value='Login']");
	
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	
	}
	
	
	public void login(String userName, String password) {
		enterEmailAddress(userName);
		enterPassword(password);
		clickLoginButton();
	}
	
	public boolean verifyLoginPageDisplay() {
		List<WebElement> elems = driver.findElements(headerText_singIn);
		
		return elems.size()>0;
	}
	
	
	
	public void enterEmailAddress(String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	
	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);

	}
	
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	
}
