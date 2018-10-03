package com.orangehrmlive.reto2.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/orangehrm_site.feature",
		glue = "com.orangehrmlive.reto2.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class OrangeHRMRunner {

}
