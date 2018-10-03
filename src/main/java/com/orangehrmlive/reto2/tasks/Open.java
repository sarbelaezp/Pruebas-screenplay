package com.orangehrmlive.reto2.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Open.browserOn;

import com.orangehrmlive.reto2.userinterface.OrangeHRMPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Open implements Task{

	private OrangeHRMPage orangeHRMPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(browserOn(orangeHRMPage));
		actor.wasAbleTo(Click.on(OrangeHRMPage.LOGIN));
	}

	public static Open TheOrangeHRMPage() {
		return instrumented(Open.class);
	}
	
}
