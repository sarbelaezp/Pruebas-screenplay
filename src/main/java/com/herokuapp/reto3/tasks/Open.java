package com.herokuapp.reto3.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Open.browserOn;

import java.util.List;

import com.herokuapp.reto3.interactions.Select;
import com.herokuapp.reto3.model.OpenForm;
import com.herokuapp.reto3.userinterface.HerokuappPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Open implements Task{

	private HerokuappPage herokuappPage;
	private List<OpenForm> openForm;
	
	public Open(List<OpenForm> openForm) {
		this.openForm = openForm;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.wasAbleTo(browserOn(herokuappPage));
		actor.wasAbleTo(Select.theList(HerokuappPage.LIST_GROUP, openForm.get(0).getListGroup().trim(), "a"));
	}

	public static Open TheHerokuappPage(List<OpenForm> dtData) {
		return instrumented(Open.class, dtData);
	}
	
}
