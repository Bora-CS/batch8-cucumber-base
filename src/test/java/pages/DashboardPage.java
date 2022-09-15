package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	//add Education
	private WebDriver driver;
	//apgeName_Function/ElementType_shortDescription
	//private By headerEditProfileLink= By.xpath("//*[@class=\'large text-primary\']");
	//private By AddExperienceLink= By.xpath("//a[@class=\'btn btn-light\'][2]");
	//private By AddEducationLink= By.xpath("//*[@href=\'/add-education\']");
	//private By headerText = By.xpath("//h1[text()='Dashboard']");
	
	@FindBy(how = How.XPATH,using = "//*[@class=\\'large text-primary\\']")
	WebElement headerEditProfileLink; 
	
	@FindBy(how = How.XPATH,using = "//a[@class=\'btn btn-light\'][2]")
	WebElement AddExperienceLink;
	
	@FindBy(xpath = "//*[@href=\\'/add-education\\']")
	WebElement AddEducationLink;
	
	@FindBy(xpath = "//h1[text()='Dashboard']")
	List<WebElement> headerText;
	
	
	public DashboardPage(WebDriver pDriver) {
		this.driver = pDriver;
		PageFactory.initElements(driver, this);
	}
	//click on EditProfile
	public void clickEditProfileLink() {
		//driver.findElement(headereditProfileLink).click();
		headerEditProfileLink.click();
	}
	//click on add Experience
	public void clickAddExperienceLink() {
		//driver.findElement(AddExperienceLink).click();
		AddExperienceLink.click();
	}
	//click on add Experience
	public void clickAddEducationLink() {
		//driver.findElement(AddEducationLink).click();
		AddEducationLink.click();
	}
	//Verify land on the page
	public boolean verifyLandOnDashBoardPage() {
		//List<WebElement> elems = driver.findElements(headerText);
		return headerText.size()>0;
	}
	}
