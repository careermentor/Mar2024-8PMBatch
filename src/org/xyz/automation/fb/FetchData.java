package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FetchData 
{
	WebDriver driver;

	
	@Test
	public void launchBrowser() throws Exception
	{
		driver= new ChromeDriver();  //launch Chrome browser
			
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		Assert.assertEquals(ActURL, ExpURL);
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		Assert.assertEquals(ActTitle, ExpTitle);
		
		String ExpUsernameText = "Email address or phone number";
		String ActUsernameText = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUsernameText);
		
		Assert.assertEquals(ActUsernameText, ExpUsernameText);
			
		String ExpLoginbttn = "Log in";
		String ActLoginbttn = driver.findElement(By.name("login")).getText();
		System.out.println(ActLoginbttn);
		
		Assert.assertEquals(ActLoginbttn, ExpLoginbttn);
		
		Point loccor = driver.findElement(By.name("login")).getLocation();
		System.out.println(loccor);
		
		System.out.println(driver.getPageSource());
		
	}
		
}
