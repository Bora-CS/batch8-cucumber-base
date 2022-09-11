package runners;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;




@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("nikkilogin")
@ConfigurationParameter(key = LUE_PROPERTY_NAME,)









public class NikkiLoginRunner {
	
	
}
