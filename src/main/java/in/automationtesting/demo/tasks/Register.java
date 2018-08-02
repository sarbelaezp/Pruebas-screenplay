package in.automationtesting.demo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import in.automationtesting.demo.model.RegisterForm;
import in.automationtesting.demo.userinterface.DemoSiteRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;;

public class Register implements Task {

	private List<RegisterForm> registerForm;
	
	public Register(List<RegisterForm> registerForm) {
		this.registerForm = registerForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(DemoSiteRegisterPage.NAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getName().trim()).into(DemoSiteRegisterPage.NAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getlastname().trim()).into(DemoSiteRegisterPage.LASTNAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getEmail().trim()).into(DemoSiteRegisterPage.EMAIL));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getPhone().trim()).into(DemoSiteRegisterPage.PHONE));
		actor.attemptsTo(Click.on(DemoSiteRegisterPage.GENDER));
		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getCountry().trim()).from(DemoSiteRegisterPage.COUNTRY));
		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getYear().trim()).from(DemoSiteRegisterPage.BIRTH_YEAR));
		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getMonth().trim()).from(DemoSiteRegisterPage.BIRTH_MONTH));
		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getDay().trim()).from(DemoSiteRegisterPage.BIRTH_DAY));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getPassword().trim()).into(DemoSiteRegisterPage.PASSWORD));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getConfirmPassword().trim()).into(DemoSiteRegisterPage.CONFIRM_PASSWORD));
		actor.attemptsTo(Click.on(DemoSiteRegisterPage.SUBMIT));
	}

	public static Register inAutomationDemoSite(List<RegisterForm> data) {
		
		return instrumented(Register.class, data);
	}

}
