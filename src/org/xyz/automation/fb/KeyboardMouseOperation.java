package org.xyz.automation.fb;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.wipro.auto.fb.utilitiesPkg.CaptureScreenshot;

public class KeyboardMouseOperation 
{
	WebDriver driver;

	@Test
	public void handleFrames() throws Exception
	{
		driver= new ChromeDriver();  
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.takingscreenshot(driver,"handleFrames");
		
	}
	
	@Test(enabled=true)
	public void handlealerts() throws Exception
	{
		driver= new ChromeDriver();  
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
		
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.takingscreenshot(driver,"handlealerts");
	}
	
	@Test(enabled=false)
	public void hanldeMouse() throws Exception
	{
		driver= new ChromeDriver();  
		
		driver.get("https://www.mphasis.com/home.html");
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform();  //left click
		//act.doubleClick(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform();  //left double click
		
		//act.contextClick(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform();  //left click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		driver= new ChromeDriver();  
			
		driver.navigate().to("https://www.facebook.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1234").perform();
		//act.sendKeys(Keys.ENTER).perform();
			
			
	}
		
}
