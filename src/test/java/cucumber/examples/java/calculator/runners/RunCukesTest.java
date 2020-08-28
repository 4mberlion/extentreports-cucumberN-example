package cucumber.examples.java.calculator.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "cucumber.examples.java.calculator.stepDefinitions",
        features = "src\\test\\resources\\cucumber\\examples\\java\\calculator",
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:lol",
                "json:target/cucumber-report.json"}
                )
public class RunCukesTest {
    
}
