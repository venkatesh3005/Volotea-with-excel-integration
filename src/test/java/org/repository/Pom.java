package org.repository;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.Base;
import org.stepdefinition.HookClass;
public class Pom extends Base{
	public Pom(){
		PageFactory.initElements(HookClass.driver, this);
		
	}
	@FindBy(xpath="//input[@value='OneWay']")
	private WebElement trip;
	@FindBy(xpath="//input[@name='origin']")
	private WebElement source;
	@FindBy(xpath="//input[@name='destination']")
	private WebElement dest;
	public WebElement getTrip() {
		return trip;
	}
	public WebElement getSource() {
		return source;
	}
	public WebElement getDest() {
		return dest;
	}
	
	

}
