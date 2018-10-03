package com.orangehrmlive.reto2.stepdefinitions;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import com.orangehrmlive.reto2.model.RegisterForm;
import com.orangehrmlive.reto2.questions.TheResult;
import com.orangehrmlive.reto2.tasks.Open;
import com.orangehrmlive.reto2.tasks.Register;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class OrangeSiteStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor steven = Actor.named("Steven");
	
	@Before
	public void initialConfig() {
		hisBrowser.manage().window().maximize();
		steven.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^that Steven needs to create an employee in Orange HRM Site$")
	public void thatStevenNeedsToCreateAnEmployeeInOrangeHRMSite() throws Exception {
	    steven.wasAbleTo(Open.TheOrangeHRMPage());
	}


	@When("^he registers the employee in the site$")
	public void heRegistersTheEmployeeInTheSite(List<RegisterForm> dtRegister) throws Exception {
	    steven.attemptsTo(Register.inOrangeHRMPage(dtRegister));
	}

	@Then("^he should see the employee's information (.*) in the site$")
	public void heShouldSeeTheNewEmployeeInTheSite(String expectedResult) throws Exception {
	    steven.should(seeThat(TheResult.is(), equalTo(expectedResult)));
	}
	
//	
//	@Given("^that Steven wants to access to Automation Demo Site$")
//	public void thatStevenWantsToAccessToAutomationDemoSite() throws Exception {
//	    steven.wasAbleTo(Open.TheDemoSitePage());
//	}
//
//
//	@When("^he registers in the site$")
//	public void heRegistersInTheSite(List<RegisterForm> dtDatosForms) throws Exception {
//	    
//	    	steven.attemptsTo(Register.inAutomationDemoSite(dtDatosForms));
//	}
//
//	@Then("^he should see the text  (.*) in the screen$")
//	public void heShouldSeeTheTextDoubleClickOnEditIconToEDITTheTableRowInTheScreen(String expectedText) throws Exception {
//	    steven.should(seeThat(TheResult.is(), equalTo(expectedText)));
//	}

}
