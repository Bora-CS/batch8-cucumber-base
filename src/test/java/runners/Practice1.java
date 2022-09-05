package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ExcludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.*;



@Suite
@ExcludeEngines("cucumber")
@SelectClasspathResource("Practice1")
@ConfigurationParameter(key=GLUE_PROPERTY_NAME,value="uiStepDefinitions")
@ConfigurationParameter(key=FILTER_TAGS_PROPERTY_NAME,value="@smoke")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME,value="pretty,html:target/Practice1_report/index.html;")
//@ConfigurationParameter(key=ANSI_COLORS_DISABLED_PROPERTY_NAME,value="true")
//@ConfigurationParameter(key=EXECUTION_DRY_RUN_PROPERTY_NAME,value="false")
public class Practice1 {	
}
