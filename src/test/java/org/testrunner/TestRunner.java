package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\cucu.feature",
glue= {"org.stepdefinition"},plugin= {"pretty","html:target"})


public class TestRunner {
	
}
