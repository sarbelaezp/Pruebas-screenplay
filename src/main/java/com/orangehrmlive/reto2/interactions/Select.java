package com.orangehrmlive.reto2.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Interaction 
{

	private Target list;
	private String option;
	
	public Select(Target list, String option) {
		this.list = list;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		List<WebElement> objectList = list.resolveFor(actor).findElements(By.tagName("li"));
		for(int i=0; i < objectList.size(); i++) 
		{
			System.out.println(objectList.get(i).getText());
			if(objectList.get(i).getText().equals(option)) 
			{
				System.out.println("Entré");
				objectList.get(i).click();
//				break;
			}
		}
	}
	
	public static Select theList(Target list, String option) 
	{
		return new Select(list, option);
		 
	}

}
