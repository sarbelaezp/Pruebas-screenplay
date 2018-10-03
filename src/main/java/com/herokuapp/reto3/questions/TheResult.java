package com.herokuapp.reto3.questions;

import com.herokuapp.reto3.userinterface.HerokuappResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(HerokuappResultPage.RESULT).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
