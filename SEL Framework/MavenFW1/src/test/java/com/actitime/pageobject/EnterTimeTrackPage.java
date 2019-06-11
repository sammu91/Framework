package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class EnterTimeTrackPage extends BasePage   // as eterntaim page has all common elements so we extends abstarct class here
{

	@FindBy(xpath="(//td[@class='pagetitle'])[2]")
	private @Getter WebElement pagetitle;
	
	
	
	public EnterTimeTrackPage (WebDriver driver)  
	{
		
		super (driver);            // calling constructor of super class constructor
		PageFactory.initElements(driver, this);         // initializing
	}
	
	
	
}
