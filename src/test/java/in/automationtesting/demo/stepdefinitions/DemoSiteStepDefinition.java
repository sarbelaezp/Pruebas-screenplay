package in.automationtesting.demo.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import in.automationtesting.demo.model.RegisterForm;
import in.automationtesting.demo.questions.TheResult;
import in.automationtesting.demo.tasks.Open;
import in.automationtesting.demo.tasks.Register;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DemoSiteStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor steven = Actor.named("Steven");
	
	@Before
	public void initialConfig() {
		steven.can(BrowseTheWeb.with(hisBrowser));
	}
	
	
	@Given("^that Steven wants to access to Automation Demo Site$")
	public void thatStevenWantsToAccessToAutomationDemoSite() throws Exception {
	    steven.wasAbleTo(Open.TheDemoSitePage());
	}


	@When("^he registers in the site$")
	public void heRegistersInTheSite(List<RegisterForm> dtDatosForms) throws Exception {
	    
	    	steven.attemptsTo(Register.inAutomationDemoSite(dtDatosForms));
	}

	@Then("^he should see the text  (.*) in the screen$")
	public void heShouldSeeTheTextDoubleClickOnEditIconToEDITTheTableRowInTheScreen(String expectedText) throws Exception {
	    steven.should(seeThat(TheResult.is(), equalTo(expectedText)));
	}

}
