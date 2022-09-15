package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	//private By headerLoginLink = By.linkText("Login");
	//private By headerRegisterLink = By.linkText("Register");
	//private By headerApplyNowLink = By.linkText("Apply Now");
	 
	
	@FindBy(how = How.LINK_TEXT,using = "Login")
	WebElement headerLoginLink;
	
	@FindBy(how = How.LINK_TEXT,using = "Register")
	WebElement headerRegisterLink;
	
	@FindBy(linkText = "Register")
	WebElement headerApplyNowLink;
	
	private final String url = "https://boratech.herokuapp.com/";
	
	 public HomePage(WebDriver passedDriver) {
		 this.driver = passedDriver;
		 PageFactory.initElements(driver,this);
	 }
	 public void navigateToHomePage() {
		 driver.get(url);
	 }
	 
	public void clickLoginBottion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));

		headerLoginLink.click();

	}
	
	
	public void clickRegisterButton() {
		headerRegisterLink.click();
		
	}
	
	public void clickApplyNOWButton() {
		headerApplyNowLink.click();
	}
	
}
