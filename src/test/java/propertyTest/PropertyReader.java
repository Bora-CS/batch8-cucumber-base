package propertyTest;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class PropertyReader {

	Properties prop;
	Properties configProp;

	public PropertyReader() {

		prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream("src/test/resources/locator.properties");
			prop.load(fis);
			
			FileInputStream configFis = new FileInputStream("src/test/resources/config.properties");
			configProp.load(configFis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getConfiguration(String key) {
		return configProp.getProperty(key);
	}
	

	public By getLocator(String locatorKey) {

		String value = prop.getProperty(locatorKey);

		String locatorType = value.split("<->")[0].trim();
		String locatorValue = value.split("<->")[1].trim();
		By locator = null;

		switch (locatorType) {
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "class":
			locator = By.className(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tag":
			locator = By.tagName(locatorValue);
			break;
		default:
			System.out.println("Locator type has issue, please check.  Key is: " + locatorKey);

		}

		return locator;
	}

}
