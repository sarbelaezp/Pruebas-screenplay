package com.orangehrmlive.reto2.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class OrangeHRMRegisterPage extends PageObject{
	
	public static final Target PIM = Target.the("PIM module")
			.locatedBy("//div[@id='main-menu']/div/div[@id='menu-content']/ul[@class='collapsible collapsible-accordion']/li[@id='menu_pim_viewPimModule']/a[@class='collapsible-header waves-effect waves-orange']");
	public static final Target ADD_EMPLOYEE = Target.the("Add Employee Option in the module PIM")
			.located(By.id("menu_pim_addEmployee"));
	public static final Target FIRST_NAME = Target.the("First Name textarea")
			.located(By.id("firstName"));
	public static final Target LAST_NAME = Target.the("Last Name textarea")
			.located(By.id("lastName"));
	public static final Target EMPLOYEE_ID = Target.the("employee id textarea")
			.located(By.id("employeeId"));
	public static final Target LOCATION = Target.the("Location list")
			.locatedBy("(.//*[normalize-space(text()) and normalize-space(.)='Australia'])[1]/following::span[1]");
	public static final Target LOCATION_LIST = Target.the("Location list")
			.located(By.id("location_inputfileddiv"));
	public static final Target SAVE_EMPLOYEE = Target.the("save employee button")
			.located(By.id("systemUserSaveBtn"));
	public static final Target BLOOD_GROUP_SELECT = Target.the("blood group list")
			.locatedBy("//div[@id='1_inputfileddiv']/div[contains(@class, 'select-wrapper initialized')]/input[contains(@class, 'select-dropdown')]");
	public static final Target BLOOD_GROUP = Target.the("select AB in blood group list")
			.locatedBy("(.//*[normalize-space(text()) and normalize-space(.)='A'])[1]/following::span[1]");
	public static final Target HOBBIES = Target.the("hobbies textarea")
			.located(By.id("5"));
	public static final Target SAVE_IMPORTANT = Target.the("save important button")
			.locatedBy("//button[contains(text(),'save')]");
	public static final Target EMPLOYEE_LIST = Target.the("employee list")	
			.located(By.id("menu_pim_viewEmployeeList"));
	public static final Target EMPLOYEE_FILTER = Target.the("employee filter textarea")
			.located(By.id("employee_name_quick_filter_employee_list_value"));
	
	public void waitObject(int t) {
		try {
			Thread.sleep(1000*t);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
