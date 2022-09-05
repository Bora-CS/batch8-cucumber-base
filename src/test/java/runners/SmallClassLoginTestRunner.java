package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ExcludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@ExcludeEngines("cucubmber")
@SelectClasspathResource("smallClass")
@ConfigurationParameter(key=GLUE_PROPERTY_NAME, value = "uiStepDefinitions, apiStepDefinitions")
@ConfigurationParameter(key=FILTER_TAGS_PROPERTY_NAME, value="@smoke")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME,value="pretty,html:target/smallClass_reprot/index.html;")
@ConfigurationParameter(key=ANSI_COLORS_DISABLED_PROPERTY_NAME,value="true")
@ConfigurationParameter(key=EXECUTION_DRY_RUN_PROPERTY_NAME,value="false")
public class SmallClassLoginTestRunner {

	
}
