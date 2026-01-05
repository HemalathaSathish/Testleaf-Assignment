package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/feature/loginmultiParameter.feature", glue = "stepDefinition") // This is to pass different values to same scenario

// @CucumberOptions(features = "src/main/java/feature/loginmultipleCred.feature", glue = "stepDefinition") // This is to pass different values to different scenario
// @CucumberOptions(features = "src/main/java/feature/login.feature", glue = "stepDefinition") -this is to pass same values to both scenario
public class RunningFeatur extends AbstractTestNGCucumberTests {

	

}
