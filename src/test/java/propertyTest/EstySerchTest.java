package propertyTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EstySerchTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver_mac");

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://www.etsy.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

			driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"))
					.sendKeys("pant" + Keys.ENTER);

			List<WebElement> productNames = driver.findElements(By.xpath("//*[@data-search-results]//a//h3"));

			List<WebElement> productPrices = driver
					.findElements(By.xpath("//*[@data-search-results]//a//*[@class='currency-value']"));

			for (int i = 0; i < 8; i++) {

				String Name = productNames.get(i).getText();
				String price = productPrices.get(i).getText();
				System.out.println(Name);
				System.out.println(price);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
