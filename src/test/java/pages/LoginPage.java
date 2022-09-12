package pages;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
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
		driver.findElement(By.name("email")).sendKeys(email);
	}
	public void enterPassword(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	public void clickLoginButton() {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
}
