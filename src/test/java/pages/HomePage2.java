package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage2 {
	
	private WebDriver driver;
	private static String URL = "https://boratech.herokuapp.com/";
	// Elements
	private By loginLinkButton = By.xpath("//a[text() = 'Login']");

	// Constructor
	public HomePage2(WebDriver driver) {
		this.driver = driver;

	}

	public void navigate() {
		driver.get(URL);
	}

	public void clickOnLoginLink() {
		driver.findElement(loginLinkButton).click();

	}
}


