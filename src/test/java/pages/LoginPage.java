package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utilities;

public class LoginPage {

	// Local variables
	private WebDriver driver;
	private static final String URL = "https://boratech.herokuapp.com/login";

	// Elements
	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailField;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginSubmitButton;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void navigate() {
		driver.get(URL);
	}

	public void enterEmailAndPassword(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
	}

	public void submitLogin() {
		loginSubmitButton.click();
		Utilities.wait(2);
	}

	public void userIsLoggedIn(String email, String password) {
		this.navigate();
		this.enterEmailAndPassword(email, password);
		this.submitLogin();
	}

	// pageName _ Function/ElementType _ shortDescription
	private By headerText_singIn = By.xpath("//h1[text()='Sign In']");
	private By loginButton = By.xpath("//input[@value='Login']");

	public void login(String userName, String password) {
		enterEmailAddress(userName);
		enterPassword(password);
		clickLoginButton();
	}

	public boolean verifyLoginPageDisplay() {
		List<WebElement> elems = driver.findElements(headerText_singIn);

		return elems.size() > 0;
	}

	public void enterEmailAddress(String email) {
		emailField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);

	}

	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}

}
