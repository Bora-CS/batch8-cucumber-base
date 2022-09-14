package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	private WebDriver driver;
	
	
//	private By headerLoginLink= By.linkText("Login");
//	private By headerRegisterLink =By.linkText("Register");
//	private By headerApplyNowLink = By.linkText("Apply Now");
	
	@FindBy(linkText = "Login")
	WebElement headerLoginLink;
	
	@FindBy(how = How.LINK_TEXT, using = "Register")
	WebElement headerRegisterLink;
	
	@FindBy(linkText = "Apply Now")
	WebElement headerApplyNowLink;

	private final String url = "https://boratech.herokuapp.com/";

	public HomePage(WebDriver passedDriver) {
		this.driver = passedDriver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void navigateToHomePage() {
		driver.get(url);

	}

	public void clickLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(headerLoginLink));

		headerLoginLink.click();

	}

	public void clickRegisterButton() {

		headerRegisterLink.click();
	}

	public void clickApplyNowButton() {
		headerApplyNowLink.click();
	}

}
