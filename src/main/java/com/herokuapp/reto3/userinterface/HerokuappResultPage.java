package com.herokuapp.reto3.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HerokuappResultPage extends PageObject {
	
	public static final Target RESULT = Target.the("'Datos guardados correctamente.' result in the page")
			.locatedBy("//p");

}
