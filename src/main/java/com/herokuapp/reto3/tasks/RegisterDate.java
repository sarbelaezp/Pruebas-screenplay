package com.herokuapp.reto3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.Date;
import java.util.List;

import com.herokuapp.reto3.model.RegisterForm;
import com.herokuapp.reto3.userinterface.HerokuappRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;;

public class RegisterDate implements Task {

	private List<RegisterForm> registerForm;
	
	public RegisterDate(List<RegisterForm> registerForm) {
		this.registerForm = registerForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		@SuppressWarnings("deprecation")
		String date = new Date().toLocaleString().substring(0, 10);
		
		actor.attemptsTo(Enter.theValue(date).into(HerokuappRegisterPage.DATE_DAY));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getIdPatientNumber().trim()).into(HerokuappRegisterPage.ID_PATIENT_NUMBER));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getIdDoctorNumber().trim()).into(HerokuappRegisterPage.ID_DOCTOR_NUMBER));
		
		actor.attemptsTo(Click.on(HerokuappRegisterPage.SAVE));
	}

	public static RegisterDate inHerokuappPage(List<RegisterForm> dtData) {
		
		return instrumented(RegisterDate.class, dtData);
	}

}
