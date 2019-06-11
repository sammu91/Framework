package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

public class CreateNewCustPage {

	@FindBy (name="name")
	private @Getter WebElement customerTXtBX;
	
	@FindBy (name="createCustomerSubmit")
	private @Getter WebElement createCustomerSubmitBtn;
	
	public CreateNewCustPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
