package testRunner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/patel/eclipse-practiceQA/Cucumber_PageFectory/src/test/resources/LoginDemo1Feature/LoginDemo1.feature",
glue="stepDefinitions",
monochrome = true)
public class TestRunner1 {

	
}
