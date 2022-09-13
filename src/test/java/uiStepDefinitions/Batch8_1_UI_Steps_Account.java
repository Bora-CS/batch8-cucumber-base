package uiStepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.PageManager;
import pojo.EducationData;
import pojo.ExpirencePojo;
import utilities.DriverFactory_batch8_1;

public class Batch8_1_UI_Steps_Account {

	
	WebDriver driver = DriverFactory_batch8_1.setUpDriver();
	PageManager pages = new PageManager(driver);
	
	

	@Then("Validate the expirence in the UI")
	public void validate_the_expirence_in_the_ui() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.navigate().refresh();
	    
	    Thread.sleep(5000);
	    
	}
	
	@Then("I add a education")
	public void i_add_a_education(List<EducationData> eduDatas) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		driver.findElement(By.xpath("//a[contains(@href,'education')]")).click();
		
		
		EducationData eduData = eduDatas.get(0);

		
		driver.findElement(By.name("school")).sendKeys(eduData.school);
		
		driver.findElement(By.name("degree")).sendKeys(eduData.degree);

		driver.findElement(By.name("fieldofstudy")).sendKeys(eduData.field);

		driver.findElement(By.name("from")).sendKeys(eduData.from);

		driver.findElement(By.name("to")).sendKeys(eduData.to);

		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(eduData.description);

		
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
	@Then("I verify the education is been added")
	public void i_verify_the_education_is_been_added() {
	    // Write code here that turns the phrase above into concrete actions
	   
		DriverFactory_batch8_1.cleanUpDriver();
	}
	

	@Then("I add an expirence")
	public void i_add_an_expirence(List<ExpirencePojo> pojos) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		
		
		
		
	}
	
	
	
	
}
