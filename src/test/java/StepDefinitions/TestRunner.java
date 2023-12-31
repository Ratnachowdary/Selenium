package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"}
,monochrome=true,
plugin= {"pretty", "html:target/cucumber-reports","json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"})
public class TestRunner {
	
}