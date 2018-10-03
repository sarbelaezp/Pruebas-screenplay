package com.orangehrmlive.reto2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com")
public class OrangeHRMResultPage extends PageObject {
	
	public static final Target RESULT = Target.the("user id after the creation").locatedBy("//td[@class='nowrap cursor-pointer']");
}
