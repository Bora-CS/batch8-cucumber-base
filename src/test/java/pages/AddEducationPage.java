package pages;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEducationPage {

	// local Variables
	WebDriver driver;

	// Elements
	@FindBy(name = "school")
	WebElement nameOfSchoolField;
	@FindBy(name = "degree")
	WebElement degreeField;
	@FindBy(name = "fieldofstudy")
	WebElement fieldofstudyField;
	@FindBy(name = "from")
	WebElement fromDateField;
	@FindBy(name = "current")
	WebElement currentCheckBox;
	@FindBy(name = "to")
	WebElement toDateField;
	@FindBy(name = "description")
	WebElement descriptionTextBox;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	@FindBy(css = "p.lead")
	WebElement subtitleText;

	// Constructor
	public AddEducationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void addEducation(String school, String degree, String fieldofstudy, String from, boolean current, String to,
			String description) {
		nameOfSchoolField.sendKeys(school);
		degreeField.sendKeys(degree);
		fieldofstudyField.sendKeys(fieldofstudy);
		fromDateField.sendKeys(from);

		if (current == true) {
			currentCheckBox.click();
		} else {
			toDateField.sendKeys(to);
		}
		descriptionTextBox.sendKeys(description);
		submitButton.click();

	}

	public void validatePageLoad() {
		assertTrue(subtitleText.getText().contains("school"), "Failed to navigate to the Add Education page.");
	}

}
