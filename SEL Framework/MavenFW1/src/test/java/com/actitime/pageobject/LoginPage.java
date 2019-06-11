package com.actitime.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;            // for creating getter method

public class LoginPage {

	@FindBy(name="username")
	private @Getter WebElement unTXBX;    // creating getter using lombok
	
	@FindBy(name="pwd")
	private @Getter WebElement pwdTXBX;
	
	@FindBy(id="loginButton")             // encapsulation using getter method
	private @Getter WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='ServerSideErrorMessage']//span")
	private @Getter WebElement invalidLoginMsg;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);  // this is creating this class object
	}
		
}
