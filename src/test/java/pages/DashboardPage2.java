package pages;

import static org.junit.jupiter.api.Assertions.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class DashboardPage2 {
	//Local Variables
	private WebDriver driver;
	
	//Elements
	private By subtitle = By.xpath("//p[@class = 'lead']");
	
	//Constuctor
	public DashboardPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	//Actions
	public void validatePageLoad() {
		WebElement subtitleElement = driver.findElement(subtitle);
		assertTrue(subtitleElement.getText().contains("welcome"),"Sign In Failed, not on Dashboard Page");

		
	}
	
	
	
	

}
