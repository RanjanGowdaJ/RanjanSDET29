package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
features={".\\src\\test\\java\\Feature\\login.feature"},
glue={"Stepdefinition"},
dryRun=true

)



public class RunnerIo extends AbstractTestNGCucumberTests {
	

}
