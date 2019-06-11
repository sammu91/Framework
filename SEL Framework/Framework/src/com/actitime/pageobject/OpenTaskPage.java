package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class OpenTaskPage
{

	@FindBy(linkText="Projects & Customers")
	private @Getter WebElement projCutLink;
	
	public OpenTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
