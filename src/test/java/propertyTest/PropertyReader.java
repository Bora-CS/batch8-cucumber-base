package propertyTest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

public class PropertyReader {

	public static void main(String[] args) {
		
		readyProFile();
		System.out.println("get key:" + readPropFileByKey("productPrice"));
	}
	
	public static String readPropFileByKey(String key) {
		
		Properties prop = new Properties();
		
		String valueOfKey = "";
		try {
		FileInputStream fis = new FileInputStream("src/test/resources/locators.properties");
		
		prop.load(fis);
		
//		String value = (String)prop.getProperty(key);
		
		valueOfKey = prop.getProperty(key);
		
		} catch (Exception e) {
			
		}
		return valueOfKey;
		
	
	}
	

	public static void readyProFile() {

		try {
			FileInputStream fis = new FileInputStream("src/test/resources/locators.properties");

			Properties prop = new Properties();

			prop.load(fis);

			Set<Object> keys = prop.keySet();

			for (Object key : keys) {
				System.out.println("key is: " + key + "\nvalue is: " + prop.get(key)+"\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
