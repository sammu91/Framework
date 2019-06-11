package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

/**
 * @author Sumit_Sharma
 *created on 06/04/2019 at 2:02pm
 */
public class BrowserFactory {

	/**
	 * @author SumitSh
	 * @param browserName
	 * @return WebDriver
	 */
	public static WebDriver launch (String browserName)    // method for calling browsers instance
	{
		WebDriver driver = null;                         // declaring and initializing driver
		
		if (browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
			
			driver = new ChromeDriver();
			Reporter.log("Chrome Launched", true);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./exefiles/geckodriver.exe");
			
			driver = new FirefoxDriver();
			Reporter.log("Chrome Launched", true);
		}
		
		return driver;
		
	}
}
