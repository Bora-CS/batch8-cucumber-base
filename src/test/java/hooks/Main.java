package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.DriverFactory;
import utilities.PageManager;
import utilities.DriverFactory_batch8_1;

public class Main {

	@Before("@ui or @UI")
	public void prepare() {
		DriverFactory.getInstance();
		PageManager.getInstance();
	}

	@After
	public void teardown() {
		DriverFactory.cleanup();
		PageManager.cleanup();
	}
	
	
	@Before("@ui_batch8_1 or @UI_batch8_1")
	public void prepare_batch8_1(){
		DriverFactory_batch8_1.setUpDriver();
	}
	
	@After("@ui_batch8_1 or @UI_batch8_1")
	public void endTest_batch8_1() {
		DriverFactory_batch8_1.cleanUpDriver();
	}
	
	
	
}
