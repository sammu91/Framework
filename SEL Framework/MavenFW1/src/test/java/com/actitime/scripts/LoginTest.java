package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeature;
import com.actitime.generic.ExcelUtilities;
import com.actitime.generic.BaseLib;

public class LoginTest extends BaseLib
{

	
	@Test (priority=1)
	public void ValidLogin()
	{
		
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("Sheet1", 1, 1);
		String password = eu.readData("Sheet1", 1, 2);
		LoginFeature lf= new LoginFeature(driver);
		lf.validLogin(username, password);
	}
	
	@Test (priority=2)
	public void InvalidLogin()
	{
		ExcelUtilities eu = new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("Sheet1", 2, 1);
		String password = eu.readData("Sheet1", 2, 2);
		LoginFeature lf= new LoginFeature(driver);
		lf.inValidLogin(username, password);	
	}
	
}
