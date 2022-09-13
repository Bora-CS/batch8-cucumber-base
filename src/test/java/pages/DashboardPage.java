package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	
	private WebDriver driver;
	
//	private By addExpirenceLink = By.xpath("//*[@href='/add-experience']");
//	private By addEducationLink = By.xpath("//*[@href='/add-education']");
//	private By headerText = By.xpath("//h1[text()='Dashboard']");
	
	@FindBy(how=How.XPATH,using="//*[@href='/add-experience']")
	WebElement addExpirenceLink;

	@FindBy(xpath = "//*[@href='/add-education']")
	WebElement addEducationLink;
	
	@FindBy(xpath = "//h1[text()='Dashboard']")
	List<WebElement> headerText;
	
	public DashboardPage(WebDriver pDrive) {
		this.driver = pDrive;
		PageFactory.initElements(driver, this);
	}
	
	
	
	// click on add Education
	public void clickAddEducationLink() {
		addEducationLink.click();
	}
	
	// click on add Experience
	public void clickAddExperienceLink() {
//		driver.findElement(addExpirenceLink).click();
		addExpirenceLink.click();
	}
	
	// Verify land on the page
	public boolean verifyLandOnDashBoardPage() {
//		List<WebElement> elems = driver.findElements(headerText);
		return headerText.size()>0;
	}
	
	
}
