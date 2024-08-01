package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.devtools.v120.network.model.ReportingApiEndpoint;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\class.feature",glue = "com.stepdefinition")



public class TextRunner {
	
	
}
