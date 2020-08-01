package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",
        glue = "stepdefinitions",
        format = {"pretty", "html:test-output", "json:json-output/","junit:junit/junit.xml"},
        dryRun = false,
        strict = true,
        monochrome = true
)
public class ApplicationRunner {

}
