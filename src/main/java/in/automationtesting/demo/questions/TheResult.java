package in.automationtesting.demo.questions;

import in.automationtesting.demo.userinterface.DemoSiteRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(DemoSiteRegisterPage.VALIDATE_CREATION).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
