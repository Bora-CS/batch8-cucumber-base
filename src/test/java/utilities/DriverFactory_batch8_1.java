package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory_batch8_1 {

	static WebDriver driver;
	private static final String chromedriver_MAC = "src/test/resources/drivers/chromedriver_mac";
	private static final String chromedriver_WINDOWS = "src/test/resources/drivers/chromedriver_windows.exe";

	public static WebDriver setUpDriver() {
		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;

	}

	public static void cleanUpDriver() {

		driver.quit();
		driver = null;
	}

	public static String getChromeDriverPath() {

		String osName = System.getProperty("os.name");
		if (osName.contains("mac")) {
			System.out.println("My os Name is : " + osName);
			return chromedriver_MAC;
		} else if (osName.contains("windoe")) {
			return chromedriver_WINDOWS;

		} else {
			System.out.println("We do not support yoour system!");
			return null;
		}

	}
}
