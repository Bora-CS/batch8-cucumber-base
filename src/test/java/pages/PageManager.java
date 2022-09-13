package pages;

import org.openqa.selenium.WebDriver;

import utilities.DriverFactory_batch8_1;

public class PageManager {

	
	private WebDriver driver;
	private static PageManager pageManager;
	
	private HomePage homePage;
	private LoginPage login;
	private DashboardPage dashBoard;
	private AddEducationPage education;
	
	public static PageManager getInstance() {
		if(pageManager == null) {
			pageManager = new PageManager(DriverFactory_batch8_1.setUpDriver());
		}
		return pageManager;
		
	}

	private PageManager(WebDriver pDriver) {
		this.driver = pDriver;
	}
	
	// return all of the page classs
	// Login
	// DashBoard
	// HomePage
	// AddEducation
	
	public HomePage getHomePage() {
		if(homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public LoginPage getLoginpage() {
		if(login == null) {
			login = new  LoginPage(driver);
		}
		return login;
	}
	public DashboardPage getDashBoardPage() {
		if(dashBoard == null) {
			dashBoard = new DashboardPage(driver);
		}
		return dashBoard;
	}
	
	public AddEducationPage getEducationPage() {
		if(education == null) {
			education = new AddEducationPage();
		}
		return education;
	}
	
}
