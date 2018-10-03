package com.herokuapp.reto3.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/hospital_administration.feature", 
		glue = "com.herokuapp.reto3.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class HerokuappRunner {

}
