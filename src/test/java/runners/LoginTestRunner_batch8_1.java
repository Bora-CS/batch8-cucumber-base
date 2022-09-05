package runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("batch8.1_feature")
// glue, 测试指定 文件夹里面的所有文件
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "uiStepDefinitions")
// tags, 测试所有有关的标签名字。 @tag
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@smoke , @ui，hooks")
// 用于出测试结果报告， 然后指定储存在某个地方；
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty,html:target/batch8_1report/report.html")
@ConfigurationParameter(key = ANSI_COLORS_DISABLED_PROPERTY_NAME, value = "true")
// When using dry run Cucumber will skip execution of glue code.
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "false")

public class LoginTestRunner_batch8_1 {

}
