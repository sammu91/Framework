package com.actitime.features;

import org.openqa.selenium.WebDriver;

import com.actitime.pageobject.ActiveProjCustPage;
import com.actitime.pageobject.CreateNewCustPage;
import com.actitime.pageobject.EnterTimeTrackPage;
import com.actitime.pageobject.LoginPage;
import com.actitime.pageobject.OpenTaskPage;

public class TaskFeature {

	WebDriver driver;   // declaring 
	LoginPage lp;
	EnterTimeTrackPage ettp;
	OpenTaskPage otp ;
	ActiveProjCustPage apcp;
	CreateNewCustPage cncp;
	
	public TaskFeature(WebDriver driver)     //initializing
	{
		this.driver=driver;
		lp=new LoginPage(driver);
		ettp =new EnterTimeTrackPage(driver);
		otp = new OpenTaskPage(driver);
		apcp=new ActiveProjCustPage(driver);
		cncp=new CreateNewCustPage(driver);
	}
	
	public void createCustome(String username, String password, String CustomerName)
	{
		lp.getUnTXBX().sendKeys(username);
		lp.getPwdTXBX().sendKeys(password);
		lp.getLoginBtn().click();
		ettp.getTaskEle();
		otp.getProjCutLink();
		apcp.getCreateNewCustBTn();
		cncp.getCustomerTXtBX().sendKeys(CustomerName);
		cncp.getCreateCustomerSubmitBtn().click();
		
		
	}
}
