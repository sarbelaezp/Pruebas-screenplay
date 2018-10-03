package com.herokuapp.reto3.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automatizacion.herokuapp.com/pperez/")
public class HerokuappPage extends PageObject {
	
	public static final Target LIST_GROUP = Target.the("group list for the different modules")
			.locatedBy("//div[@class='list-group']");

}
