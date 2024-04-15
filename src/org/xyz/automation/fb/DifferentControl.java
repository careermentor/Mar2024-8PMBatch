package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class DifferentControl 
{
	WebDriver driver;

	
	@Test
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		
			
			driver= new ChromeDriver();  //launch Chrome browser
			
			driver.navigate().to("https://thetestingworld.com/testings/");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement x = driver.findElement(By.name("fld_username"));
			x.sendKeys("Selenium");
			
			
			
			driver.findElement(By.name("fld_username")).clear();
			
			driver.findElement(By.name("fld_username")).sendKeys("Java");
			
			driver.findElement(By.cssSelector("[value='home']")).click();
			
			System.out.println(driver.findElement(By.name("terms")).isSelected());  //false
			
			driver.findElement(By.name("terms")).click();
			
			System.out.println(driver.findElement(By.name("terms")).isSelected());  //true
			
			System.out.println(driver.findElement(By.cssSelector("[value='Sign up']")).isEnabled()); //true
			
			Select gender = new Select(driver.findElement(By.name("sex")));
			gender.selectByIndex(2);
			//gender.selectByValue("1");
			//gender.selectByVisibleText("Male");
			
			Select con = new Select(driver.findElement(By.name("country")));
			con.selectByVisibleText("United States");
			
			Select st = new Select(driver.findElement(By.name("state")));
			
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
			
			st.selectByVisibleText("Florida");
			
			Select ct = new Select(driver.findElement(By.name("city")));
			ct.selectByVisibleText("Beach");
			
			
			//driver.findElement(By.name("sex")).sendKeys("")
			
			
			//driver.findElement(By.className("displayPopup")).click();
			
	}
		
}
