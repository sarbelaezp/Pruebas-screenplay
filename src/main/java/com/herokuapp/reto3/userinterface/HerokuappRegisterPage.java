package com.herokuapp.reto3.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HerokuappRegisterPage extends PageObject{
	
	public static final Target NAME = Target.the("'nombre' input text")
			.locatedBy("//input[@placeholder='Ingrese el nombre']");
	public static final Target LASTNAME = Target.the("'apellidos' input text")
			.locatedBy("//input[@placeholder='Ingrese los apellidos']");
	public static final Target PHONE = Target.the("'teléfono' input text")
			.locatedBy("//input[@placeholder='Ingrese el teléfono']");
	
	public static final Target ID_TYPE = Target.the("identification_type list")
			.locatedBy("//select");
	
	public static final Target ID_NUMBER = Target.the("'documento de identidad' input text")
			.locatedBy("//input[@placeholder='Ingrese el documento de identidad']");
	
	public static final Target ID_DOCTOR_NUMBER = Target.the("'documento de identidad' input text")
			.locatedBy("//input[@placeholder='Ingrese el documento de identidad del doctor']");
	
	public static final Target ID_PATIENT_NUMBER = Target.the("'documento de identidad' input text")
			.locatedBy("//input[@placeholder='Ingrese el documento de identidad del paciente']");
	
	public static final Target PREPAID = Target.the("'Salud prepagada' checkbox")
			.locatedBy("//input[@name='prepaid']");
	
	public static final Target SAVE = Target.the("'Guardar' button")
			.locatedBy("//a[contains(@class, 'btn btn-primary pull-right')]");
	
	public static final Target DATE_DAY = Target.the("date day picker of input text type")
			.located(By.id("datepicker"));
	
	public void waitObject(int t) {
		try {
			Thread.sleep(1000*t);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
