package pages;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	// Local Variables
	private WebDriver driver;

	// Elements
	@FindBy(xpath = "//p[@class='lead']")
	private WebElement subtitleText;
	@FindBy(xpath = "//a[contains(text(), 'Education')]")
	private WebElement addEducationButton;
	@FindBy(css = ".alert.alert-success")
	private WebElement successAlert;

	// Constructor
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void validatePageLoad() {
		assertTrue(subtitleText.getText().contains("Welcome"), "Sign In Failed, not on Dashboard Page");
	}

	public void clickAddedExperienceButton() {
		addEducationButton.click();
	}

	public void successAlertMessageValidation() {
		try {
			assertTrue(successAlert.isDisplayed());
		} catch (NoSuchElementException e) {
			assertTrue(false, "The success alert was not found");
		}
	}

}
