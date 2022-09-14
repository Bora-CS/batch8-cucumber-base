package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Utilities;

public class LoginPage2 {

	private WebDriver driver;

	// Elements
	private By emailField = By.xpath("//input[@name = 'email']");
	private By passwordField = By.xpath("//input[@name = 'password']");
	private By loginSubmitButton = By.xpath("//input[@type = 'submit']");

	// Constructor
	public LoginPage2(WebDriver driver) {
		this.driver = driver;

	}

	// Actions
	public void enterEmailAndPassword(String email, String password) {
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(password);

	}

	public void submitLogin() {
		driver.findElement(loginSubmitButton).click();
		Utilities.wait(2);
	}

}
