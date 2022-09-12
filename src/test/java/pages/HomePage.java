package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver passedDriver) {
		this.driver = passedDriver;
	}
	
	
	
	public void navigateToHomePage() {
		driver.get("https://boratech.herokuapp.com/");

	}

	public void clickLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

		driver.findElement(By.linkText("Login")).click();

	}

	public void clickRegisterButton() {

		driver.findElement(By.linkText("Register")).click();
	}

	public void clickApplyNowButton() {
		driver.findElement(By.linkText("Apply Now")).click();
	}

}
