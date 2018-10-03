package com.herokuapp.reto3.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.herokuapp.reto3.model.OpenForm;
import com.herokuapp.reto3.model.RegisterForm;
import com.herokuapp.reto3.questions.TheResult;
import com.herokuapp.reto3.tasks.Open;
import com.herokuapp.reto3.tasks.RegisterDate;
import com.herokuapp.reto3.tasks.RegisterDoctor;
import com.herokuapp.reto3.tasks.RegisterPatient;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class HerokuappStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor steven = Actor.named("Steven");
	
	@Before
	public void initialConfig() {
		hisBrowser.manage().window().maximize();
		steven.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Carlos needs to register a new doctor")
	public void thatCarlosNeedsToRegisterANewDoctor(List<OpenForm> lstData) throws Exception {
	    steven.wasAbleTo(Open.TheHerokuappPage(lstData));
	}
	
	@Given("^that Carlos needs to register a new patient")
	public void thatCarlosNeedsToRegisterANewPatient(List<OpenForm> lstData) throws Exception {
	    steven.wasAbleTo(Open.TheHerokuappPage(lstData));
	}
	
	@Given("^that Carlos needs to register a new date")
	public void thatCarlosNeedsToRegisterANewDate(List<OpenForm> lstData) throws Exception {
	    steven.wasAbleTo(Open.TheHerokuappPage(lstData));
	}
	
	@When("^he registers a doctor in the application$")
	public void heDoesARegisterOfTheSameInTheApplication(List<RegisterForm> lstData) throws Exception {
	    steven.attemptsTo(RegisterDoctor.inHerokuappPage(lstData));
	}
	
	@When("^he registers a patient in the application$")
	public void heDoesARegisterOfThePatientInTheApplication(List<RegisterForm> lstData) throws Exception {
	    steven.attemptsTo(RegisterPatient.inHerokuappPage(lstData));
	}
	
	@When("^he registers a date in the application$")
	public void heDoesARegisterOfTheDateInTheApplication(List<RegisterForm> lstData) throws Exception {
	    steven.attemptsTo(RegisterDate.inHerokuappPage(lstData));
	}

	@Then("^he should see the message in the screen (.*)$")
	public void heShouldSeeTheMessageDatosGuardadosCorrectamenteInTheScreen(String expectedText) throws Exception {
	    steven.should(seeThat(TheResult.is(), equalTo(expectedText)));
	}
		

}
