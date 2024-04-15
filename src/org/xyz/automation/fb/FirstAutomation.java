package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FirstAutomation 
{
	WebDriver driver;

	
	@BeforeMethod
	public void launchBrowser()
	{
		//WebDriverManager.chromedriver().setup();
		
			
			driver= new ChromeDriver();  //launch Chrome browser
				
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		
			
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
		
	}
	
	@Test(enabled=false)
	public void loginfunc()
	{
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test(enabled=true)
	public void signupfunc() throws Exception
	{
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}
