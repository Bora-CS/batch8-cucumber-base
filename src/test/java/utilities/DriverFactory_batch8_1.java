package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory_batch8_1 {

<<<<<<< HEAD
	static WebDriver driver;
	private static final String chromedriver_MAC = "src/test/resources/drivers/chromedriver_mac";
	private static final String chromedriver_WINDOWS = "src/test/resources/drivers/chromedriver_windows.exe";

	public static WebDriver setUpDriver() {
		if (driver == null) {

			System.setProperty("webdriver.chrome.driver", "");
=======
	private static WebDriver driver;
	private static final String chromeDriver_MAC = "src/test/resources/drivers/chromedriver_mac";
	private static final String chromeDriver_WINDOWS = "src/test/resources/drivers/chromedriver_windows.exe";
	

	public static WebDriver setUpDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", getChromeDriverPath());
>>>>>>> batch8.1_Master
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		return driver;
<<<<<<< HEAD

=======
>>>>>>> batch8.1_Master
	}

	public static void cleanUpDriver() {

		driver.quit();
		driver = null;
	}
<<<<<<< HEAD

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
=======
	
	public static String getChromeDriverPath() {
		
		String osName = System.getProperty("os.name");
		if(osName.contains("mac")) {
			System.out.println("My OS Name is: "+osName);
			return chromeDriver_MAC;
		}else if(osName.contains("window")) {
			return chromeDriver_WINDOWS;
		}else {
			System.out.println("We do NOT support your system!");
			return null;
		}
	
	}

	

>>>>>>> batch8.1_Master
}
