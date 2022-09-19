package utilities;

import java.io.FileInputStream;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;

public class ObjectRepository {

	private static FileInputStream fis = null;
	private static Properties props = null;

	public static void prepare() {
		try {
			fis = new FileInputStream("src/test/resources/properties/ObjectRepository.properties");
			props = new Properties();
			props.load(fis);
			
//	Set<Entry<Object,Object>> entries = props.entrySet();
//	for(Entry<Object,Object>entry : entries) {
//		System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
//	}
//	Set<Object> keys = props.keySet();
//	for(Object key : keys) {
//		System.out.println("Key: " + key + "Value: " + props.get(key));
//	}
			
	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static By locator(String objectName) {

		By locator = null;

		try {
			if (props == null) {
				prepare();
			}

			String value = props.getProperty(objectName);

			String locatorType = value.split("->")[0].toLowerCase().trim();
			String locatorValue = value.split("->")[1].trim();

			switch (locatorType) {
			case "css":
			case "cssselector":
				locator = By.cssSelector(locatorValue);
				break;
			case "xpath":
				locator = By.xpath(locatorValue);
				break;
			case "name":
				locator = By.name(locatorValue);
				break;
			case "linktext":
			case "partiallinktext":
				locator = By.partialLinkText(locatorValue);
				break;
			case "text":
				locator = By.xpath("//*[contains(text(), " + locatorValue + ")]");
				break;
			case "id":
				locator = By.id(locatorValue);
				break;
			case "classname":
			case "class":
				locator = By.className(locatorValue);
				break;
			case "tagname":
			case "tag":
				locator = By.tagName(locatorValue);
				break;
			default:
				throw new Exception("Locator type [" + locatorType + "] is not supported");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return locator;

	}

}