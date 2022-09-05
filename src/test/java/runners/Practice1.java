package runners;

import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ExcludeEngines;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("smallClass")
@ConfigurationParameter(key=GLUE_PROPERTY_NAME,value="uiStepDefinitions")
@ConfigurationParameter(key=FILTER_TAGS_PROPERTY_NAME,value="@p")
@ConfigurationParameter(key=PLUGIN_PROPERTY_NAME,value="pretty, html:target/Practice1_report/index.html;")
//@ConfigurationParameter(key=ANSI_COLORS_DISABLED_PROPERTY_NAME,value="true")
//@ConfigurationParameter(key=EXECUTION_DRY_RUN_PROPERTY_NAME,value="false")
public class Practice1 {	
}
