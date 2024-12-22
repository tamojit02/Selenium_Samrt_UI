package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resource/features", // Path to your feature files
        glue = {"stepDefinition"}, // Package name for your step definitions
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags= "@easytripTest",
        monochrome = true // for readable console output
)


public class Runner extends AbstractTestNGCucumberTests {
    // Overriding the default data provider to support parallel execution
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
