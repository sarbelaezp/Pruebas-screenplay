package com.orangehrmlive.reto2.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import java.util.List;

import com.orangehrmlive.reto2.model.RegisterForm;
import com.orangehrmlive.reto2.userinterface.OrangeHRMRegisterPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;;

public class Register implements Task {

	private List<RegisterForm> registerForm;
	
	public Register(List<RegisterForm> registerForm) {
		this.registerForm = registerForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.PIM));
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.ADD_EMPLOYEE));
		WaitUntil.the(OrangeHRMRegisterPage.FIRST_NAME, isVisible());
		new OrangeHRMRegisterPage().waitObject(6);
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getFirstname().trim()).into(OrangeHRMRegisterPage.FIRST_NAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getLastname().trim()).into(OrangeHRMRegisterPage.LAST_NAME));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getEmployeeId().trim()).into(OrangeHRMRegisterPage.EMPLOYEE_ID));
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.LOCATION_LIST));
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.LOCATION));
//		actor.attemptsTo(Select.theList(OrangeHRMRegisterPage.LOCATION, "     " + registerForm.get(0).getLocation()));
//		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getLocation()).from(OrangeHRMRegisterPage.LOCATION));
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.SAVE_EMPLOYEE));
		new OrangeHRMRegisterPage().waitObject(5);
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.BLOOD_GROUP_SELECT));
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.BLOOD_GROUP));
//		actor.attemptsTo(SelectFromOptions.byVisibleText(registerForm.get(0).getBloodGroup().trim()).from(OrangeHRMRegisterPage.BLOOD_GROUP));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getHobbies().trim()).into(OrangeHRMRegisterPage.HOBBIES));
		new OrangeHRMRegisterPage().waitObject(1);
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.SAVE_IMPORTANT));
		new OrangeHRMRegisterPage().waitObject(4);
		actor.attemptsTo(Click.on(OrangeHRMRegisterPage.EMPLOYEE_LIST));
		actor.attemptsTo(Enter.theValue(registerForm.get(0).getEmployeeId().trim()).into(OrangeHRMRegisterPage.EMPLOYEE_FILTER));
		new OrangeHRMRegisterPage().waitObject(4);
	}

	public static Register inOrangeHRMPage(List<RegisterForm> data) {
		
		return instrumented(Register.class, data);
	}

}
