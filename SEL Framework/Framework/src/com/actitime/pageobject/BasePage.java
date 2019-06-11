package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public abstract class BasePage {

	@FindBy(xpath="//div[text()='Tasks']")
	private @Getter WebElement taskEle;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
