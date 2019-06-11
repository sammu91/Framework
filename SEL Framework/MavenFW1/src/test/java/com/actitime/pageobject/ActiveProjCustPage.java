package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class ActiveProjCustPage
{

	@FindBy(css="input[value='Create New Customer'")
	private @Getter WebElement CreateNewCustBTn;
	
	public ActiveProjCustPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
