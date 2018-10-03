package com.herokuapp.reto3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import com.herokuapp.reto3.interactions.Select;
import com.herokuapp.reto3.model.RegisterForm;
import com.herokuapp.reto3.userinterface.HerokuappRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;;

public class RegisterPatient implements Task {

	private List<RegisterForm> registerForm;
	
	public RegisterPatient(List<RegisterForm> registerForm) {
		this.registerForm = registerForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getName().trim()).into(HerokuappRegisterPage.NAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getLastname().trim()).into(HerokuappRegisterPage.LASTNAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getPhone().trim()).into(HerokuappRegisterPage.PHONE));
		actor.attemptsTo(Click.on(HerokuappRegisterPage.ID_TYPE));
		actor.attemptsTo(Select.theList(HerokuappRegisterPage.ID_TYPE, registerForm.get(0).getIdType().trim(), "option"));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getIdPatientNumber().trim()).into(HerokuappRegisterPage.ID_NUMBER));
		actor.attemptsTo(Click.on(HerokuappRegisterPage.PREPAID));
		
		actor.attemptsTo(Click.on(HerokuappRegisterPage.SAVE));
	}

	public static RegisterPatient inHerokuappPage(List<RegisterForm> data) {
		
		return instrumented(RegisterPatient.class, data);
	}

}
