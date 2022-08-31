package hellocucumber;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("hellocucumber")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "html:target/html-report/index.html")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "hellocucumber")
public class RunCucumberTest {
}
