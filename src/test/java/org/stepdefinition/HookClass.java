package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass {
	 public static WebDriver driver;
	@Before
	public void first() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sM\\eclipse-workspace\\venkii\\Selenium\\driv\\chromedriver.exe" );
		driver=new ChromeDriver();
	}
	@After
	public void last() {
		driver.quit();
	}
	

}
