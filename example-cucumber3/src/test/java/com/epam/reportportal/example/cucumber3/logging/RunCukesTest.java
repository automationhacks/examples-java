package com.epam.reportportal.example.cucumber3.logging;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"com.epam.reportportal.cucumber.StepReporter" }, features = "src/test/resources/com/epam/reportportal/example/cucumber3/logging", tags = "~@ignore")
public class RunCukesTest {
}
