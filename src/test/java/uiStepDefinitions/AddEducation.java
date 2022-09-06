package uiStepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class AddEducation {

	public void user_updates(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		
		
		
		Map<String, String> addEducation = dataTable.asMaps().get(0);
		driver.findElement(By.linkText("Add Education")).click();
		driver.findElement(By.name("school")).sendKeys("BoraTech");
		driver.findElement(By.name("degree")).sendKeys("Test Automation Degree");
		driver.findElement(By.name("fieldofstudy")).sendKeys("Test Automation");
		driver.findElement(By.name("from")).sendKeys("05/07/2022");
		driver.findElement(By.name("current")).click();
		driver.findElement(By.tagName("textarea")).sendKeys("This is fun");
		
		if (!addEducation.get("current").equals(null)) {
			driver.findElement(By.name("current")).click();
		}
		driver.findElement(By.tagName("textarea")).sendKeys(addEducation.get("description"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);

	}

	@And("user should see the success alert for add education")
	public void user_should_see_the_success_alert_works() {
		try {
			assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed());
		} catch (NoSuchElementException e) {
			assertTrue(false, "The success alert was not found");
		}
	}

}
	
//@Then("user adds an education")
//public void user_updates_add_education(DataTable dataTable) {
//	Map<String, String> education = dataTable.asMaps().get(0);
//	driver.findElement(By.name("school")).sendKeys(education.get("school"));
//	driver.findElement(By.name("degree")).sendKeys(education.get("degree"));
//	driver.findElement(By.name("fieldofstudy")).sendKeys(education.get("fieldofstudy"));
//	driver.findElement(By.name("from")).sendKeys(education.get("from date"));
//	if (!education.get("current").equals(null)) {
//		driver.findElement(By.name("current")).click();
//	} else {
//		driver.findElement(By.name("to")).sendKeys(education.get("to"));
//	}
//	driver.findElement(By.tagName("textarea")).sendKeys(education.get("description"));
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
//}
//}
