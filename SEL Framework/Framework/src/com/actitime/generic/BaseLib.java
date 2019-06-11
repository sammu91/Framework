package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public class BaseLib {

	public static WebDriver driver;      //Global
	
	@BeforeMethod
	@Parameters ({"browser","baseurl"})
	public void precondition(String browserName,String Url){
		
		driver=BrowserFactory.launch(browserName);    // now driver has browser instance. Launch is a static method and can call by class name
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(Url);
		Reporter.log(Url+ "URL navigated", true);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
		if(driver!=null)
		{
			driver.quit();
		}
		Reporter.log("Browser closed",true);
	}
	
}
