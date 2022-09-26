package propertyTest;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstySearchTest {
	
	
	// run a test
	// No Cucumber, No jUnit, No TestNG
	
	public static void main(String[] args) {
		
		PropertyReader reader = new PropertyReader();
		
		//					KEY							VALUE
		System.setProperty("webdriver.chrome.driver", reader.getConfiguration("driverPath"));
		WebDriver driver = new ChromeDriver();
		try {
			
			driver.get(reader.getConfiguration("UI_URL"));
//			driver.navigate().to("https://www.etsy.com/?ref=lgo");
			
			
			driver.findElement(reader.getLocator("searchBox")).
			sendKeys("pant" + Keys.ENTER);
			
			Thread.sleep(2*1000);
			
			//   Product Name
			//*[@data-search-results]//a//h3
			//   Product price
			//*[@data-search-results]//a//*[@class='currency-value']
			
			List<WebElement> productNames = 
					driver.findElements(reader.getLocator("productName"));
			
			List<WebElement> productPrices =
					driver.findElements(reader.getLocator("producPrice"));
			
			for(int i=0; i<8; i++) {
				System.out.println("Product name is: "+productNames.get(i).getText());
				System.out.println("Product price is: "+productPrices.get(i).getText()+"\n");
			}
			
			
			
		}catch(Exception e) {
			
		}finally {
			driver.quit();
		}
		
		
		
		
		
	}
	
	
	
	

}