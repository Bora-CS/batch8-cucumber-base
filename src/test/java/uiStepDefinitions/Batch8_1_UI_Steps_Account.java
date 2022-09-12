package uiStepDefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
<<<<<<< HEAD
=======
import pojo.EducationData;
import utilities.DriverFactory;
>>>>>>> master
import utilities.DriverFactory_batch8_1;

public class Batch8_1_UI_Steps_Account {

	
<<<<<<< HEAD
	WebDriver driver = DriverFactory_batch8_1.setUpDriver();
=======
	WebDriver driver = DriverFactory.setUpDriver();
>>>>>>> master
	
	
	

	@Then("Validate the expirence in the UI")
	public void validate_the_expirence_in_the_ui() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.navigate().refresh();
	    
	    Thread.sleep(5000);
	    
	}
	
	@Then("I add a education")
	public void i_add_a_education(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		driver.findElement(By.xpath("//a[contains(@href,'education')]")).click();
		
		Map<String,String> edu = dataTable.asMaps().get(0);
		
<<<<<<< HEAD
=======
		EducationData eduData = eduData.get(0);
		//EducationData deuData = new EducationData(cucumberDataTable.get("school"),cucumberDataTable.get(edu)
				//cucumberDataTable.get("from"),cucumberDataFrom()

>>>>>>> master
		driver.findElement(By.name("school")).sendKeys(edu.get("school"));
		
		driver.findElement(By.name("degree")).sendKeys(edu.get("degree"));

		driver.findElement(By.name("fieldofstudy")).sendKeys(edu.get("field"));

		driver.findElement(By.name("from")).sendKeys(edu.get("from"));

		driver.findElement(By.name("to")).sendKeys(edu.get("to"));

		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(edu.get("Description"));

		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	@Then("I verify the education is been added")
	public void i_verify_the_education_is_been_added() {
	    // Write code here that turns the phrase above into concrete actions
	   
<<<<<<< HEAD
		DriverFactory_batch8_1.cleanUpDriver();
=======
		DriverFactory.cleanUpDriver();
>>>>>>> master
	}
	
	
	
}
