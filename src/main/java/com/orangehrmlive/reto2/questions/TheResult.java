package com.orangehrmlive.reto2.questions;

import com.orangehrmlive.reto2.userinterface.OrangeHRMResultPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		
		return Text.of(OrangeHRMResultPage.RESULT).viewedBy(actor).asString();
	}

	public static TheResult is() {
		return new TheResult();
	}

}
