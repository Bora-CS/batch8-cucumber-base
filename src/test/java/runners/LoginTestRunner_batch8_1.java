package runners;

import static io.cucumber.junit.platform.engine.Constants.*;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("batch8.1_features")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/batch8_1-report/index.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "uiStepDefinitions")

@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@wip")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/batch8-1_report/index.html")
@ConfigurationParameter(key = ANSI_COLORS_DISABLED_PROPERTY_NAME, value = "true")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "true")
public class LoginTestRunner_batch8_1 {

}
