package in.automationtesting.demo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Open.browserOn;

import in.automationtesting.demo.userinterface.DemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Open implements Task{

	private DemoSitePage demoSitePage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(browserOn(demoSitePage));
		
	}

	public static Open TheDemoSitePage() {
		return instrumented(Open.class);
	}
	
}
