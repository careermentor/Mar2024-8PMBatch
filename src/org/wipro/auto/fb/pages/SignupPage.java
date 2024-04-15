package org.wipro.auto.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.fb.utilitiesPkg.ReadPropFile;

public class SignupPage 
{
	
	WebDriver driver;

	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	public void click_CreateNewAccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementprop("FB_login_createnewaccountBttn_xpath"))).click();
	}

	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementprop("FB_Signup_Firstname_name"))).sendKeys(fname);
	}
	
	public void enter_dob_day(String dobday) throws Exception
	{
		Select day = new Select(driver.findElement(By.name(ReadPropFile.readelementprop("FB_Signup_dob_day_name"))));
		day.selectByVisibleText(dobday);
		
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementprop("FB_Signup_submit_name"))).click();
	}
	
}
