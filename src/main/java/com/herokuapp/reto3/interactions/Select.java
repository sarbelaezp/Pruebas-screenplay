package com.herokuapp.reto3.interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

public class Select implements Interaction 
{

	private Target list;
	private String option, tagName;
	
	public Select(Target list, String option, String tagName) {
		this.list = list;
		this.option = option;
		this.tagName = tagName;
	}

	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		List<WebElement> objectList = list.resolveFor(actor).findElements(By.tagName(tagName));
		for(int i=0; i < objectList.size(); i++) 
		{
			if(objectList.get(i).getText().equals(option)) 
			{
				objectList.get(i).click();
				break;
			}
		}
	}
	
	public static Select theList(Target list, String option, String tagName) 
	{
		return new Select(list, option, tagName);
		 
	}

}
