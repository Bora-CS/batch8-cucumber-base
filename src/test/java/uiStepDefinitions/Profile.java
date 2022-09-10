package uiStepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojo.Education;
import pojo.Experience;
import utilities.DriverFactory;
import utilities.PageManager;

public class Profile {

	private PageManager pages = PageManager.getInstance();

//	@Then("^user clicks the (\"Add Experience\"|\"Add Education\") button$")
//	public void addEducationOrAddExperience(String target)  {
//		driver.findElement(By.xpath("//*[contains(text(), " + target + ")]")).click();
//		Thread.sleep(2000);
//	}
	
	@When("[POM] user clicks the {string} button")
	public void pom_user_clicks_the_button(String addEducation ) {
	    pages.getDashboardPage().clickAddedExperienceButton();
	}
	
	@Then("[POM] user should be navigated to the Dashboard page")
	public void pom_user_should_be_navigated_to_the_dashboard_page() {
	    pages.getDashboardPage().validatePageLoad();
	}

	@Then("[POM] user should be navigated to the Add Education page")
	public void pom_user_should_be_navigated_to_the_add_education_page() {
	    pages.getAddEducationPage().validatePageLoad();
	}

	@When("user adds an experience")
	public void user_enters_experiences(List<Experience> experiences) {
		for (Experience experience : experiences) {
			driver.findElement(By.xpath("//input[@placeholder='* Job Title']")).sendKeys(experience.title);
			driver.findElement(By.name("company")).sendKeys(experience.company);
			driver.findElement(By.name("location")).sendKeys(experience.location);
			driver.findElement(By.name("from")).sendKeys(experience.from);
			if (experience.current) {
				driver.findElement(By.xpath("//input[@name='current']")).click();
			} else {
				driver.findElement(By.name("to")).sendKeys(experience.to);
			}
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(experience.description);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
		}
	}

	@Then("user adds an education")
	public void user_updates_add_education(List<Education> educations) {
		for (Education education : educations) {
			pages.getAddEducationPage().addEducation(education.school, education.degree, education.fieldofstudy,
					education.from, education.current, education.to, education.description);
		}
	}
}
