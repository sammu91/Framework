package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobject.EnterTimeTrackPage;
import com.actitime.pageobject.LoginPage;

public class LoginFeature {

	
	WebDriver driver;
	LoginPage lp;
	EnterTimeTrackPage ettp;
	
	
	
	public LoginFeature(WebDriver driver)            // custom constructor
	{
		this.driver=driver;
		lp=new LoginPage(driver);
		ettp=new EnterTimeTrackPage(driver);
	}
	
	public void validLogin(String username, String password)
	{
		lp.getUnTXBX().sendKeys(username);
		lp.getPwdTXBX().sendKeys(password);
		lp.getLoginBtn().click();
														    // Verifying login page using assertion 
		String actualText =ettp.getPagetitle().getText();
		String expectedText="Enter Time-Track";
		Assert.assertEquals(actualText, expectedText);     // Using hard assert as it is basic and critical feature
		Reporter.log("Home page is verified", true);
		
		String actualTitle=driver.getTitle();              
		String expectedTitle = "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualTitle, expectedTitle);
		Reporter.log("Home page title is verified", true);		
		
	}
	
	
	public void inValidLogin(String username, String password)
	{
		lp.getUnTXBX().sendKeys(username);
		lp.getPwdTXBX().sendKeys(password);
		lp.getLoginBtn().click();
		
		String actualMsg=lp.getInvalidLoginMsg().getText();
		String expectedMsg="Username or Password is invalid. Please try again.";
		Assert.assertEquals(actualMsg, expectedMsg);
		Reporter.log("invalid login error message is verified", true);
	}
	
	
	
	
}
