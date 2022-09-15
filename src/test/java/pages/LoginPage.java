package pages;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	//pageName_Function/ElementType_shortDescription
	private By headerText_singn= By.xpath("//h1[text()='Sign in']");
	private By emailfield= By.name("email");
	private By passwordfield= By.name("password");
	private By loginButton = By.xpath("//h1[text()='Sign In']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String userName,String password) {
		enterEmailAddress(userName);
		enterPassword(password);
		clickLoginButton();
	
	}
	
	public boolean verifyLoginPageDisplay() {
		List<WebElement> elems = driver.findElements(By.xpath("//h1[text()='Sign In']"));
		
		return elems.size()>0;
	}
	
	public void enterEmailAddress(String email) {
		driver.findElement(emailfield).sendKeys(email);
	}
	public void enterPassword(String password) {
		driver.findElement(passwordfield).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
}
	}
