package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageManager {

	private WebDriver driver;
	private HomePage homePage; 
	private LoginPage loginPage;
	private DashboardPage dashboard;
	private AddEducationPage education;
	
	
	public PageManager(WebDriver pDriver) {
		this.driver = pDriver;
	}

	//return all of the page class
	//login
	//DashBoard
	//HomePage
	//AddEducation
	
	public HomePage getHomePage() {
		if (homePage == null) {
		homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public LoginPage getLoginPage() {
		if (loginPage == null) {
		loginPage = new LoginPage(driver);
	}
		return loginPage;
	}
	public  DashboardPage getDashboradPage() {
		if (dashboard == null) {
		dashboard = new DashboardPage(driver);	
	}
		return dashboard;
	}
	public  AddEducationPage getEducationPage() {
		if (education == null) {
			 education = new AddEducationPage();	
	}
		return education;
}
}
