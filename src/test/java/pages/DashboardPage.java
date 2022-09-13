package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	//add Education
	WebDriver driver;
	//apgeName_Function/ElementType_shortDescription
	private By headereditProfile= By.xpath("//*[@class=\"large text-primary\"]");
	private By AddExperienceLink= By.xpath("//a[@class=\"btn btn-light\"][2]");
	private By AddEducationLink= By.name("//*[@href=\'/add-education\']");
	private By headerLoginButton = By.xpath("//h1[text()='Sign In']");
	
	
	
	public DashboardPage(WebDriver pDriver) {
		this.driver = pDriver;
	}
	
	public void editProfile() {
		driver.findElement(headereditProfile).click();;
	
	}
	
	public void AddExperience() {
		driver.findElement(AddExperienceLink).click();
	}
	
	public void AddEducation(String password) {
		driver.findElement(AddEducationLink).click();
	}
	public void clickLoginPage() {
		driver.findElement(headerLoginButton).click();
}
	}

	//add Experience
	
	//Verify land on the apge
	

