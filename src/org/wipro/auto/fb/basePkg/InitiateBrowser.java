package org.wipro.auto.fb.basePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.auto.fb.utilitiesPkg.ReadPropFile;

public class InitiateBrowser 
{
	
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ReadPropFile.readconfigprop("BroswerName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFile.readconfigprop("BroswerName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadPropFile.readconfigprop("BroswerName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropFile.readconfigprop("ApplicationURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
