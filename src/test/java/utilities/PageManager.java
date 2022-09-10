package utilities;

import org.openqa.selenium.WebDriver;

import pages.*;

public class PageManager {

	private static PageManager pageManager;
	private WebDriver driver;

	private HomePage homePage;
	private LoginPage loginPage;
	private DashboardPage dashboardPage;
	private AddEducationPage addEducationPage;

	public static PageManager getInstance() {
		if (pageManager == null) {
			pageManager = new PageManager(DriverFactory.getInstance());
		}
		return pageManager;
	}

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		if (homePage == null) {
			this.homePage = new HomePage(driver);
		}
		return this.homePage;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			this.loginPage = new LoginPage(driver);
		}
		return this.loginPage;
	}

	public DashboardPage getDashboardPage() {
		if (dashboardPage == null) {
			this.dashboardPage = new DashboardPage(driver);
		}
		return this.dashboardPage;
	}

	public AddEducationPage getAddEducationPage() {
		if (addEducationPage == null) {
			this.addEducationPage = new AddEducationPage(driver);
		}
		return this.addEducationPage;
	}

}
