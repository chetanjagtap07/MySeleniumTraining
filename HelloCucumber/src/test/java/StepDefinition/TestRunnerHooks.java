package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:/Workspace/MySeleniumTraining/HelloCucumber/src/test/resources/Features/Hooks.feature",
glue="StepDefinition",
monochrome=true)


public class TestRunnerHooks {

}
