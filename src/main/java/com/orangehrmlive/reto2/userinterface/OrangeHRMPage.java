package com.orangehrmlive.reto2.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com")
public class OrangeHRMPage extends PageObject {
	
	public static final Target LOGIN = Target.the("Login button").located(By.id("btnLogin"));
}
