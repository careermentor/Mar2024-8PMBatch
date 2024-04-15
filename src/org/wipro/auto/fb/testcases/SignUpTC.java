package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitiateBrowser;
import org.wipro.auto.fb.pages.SignupPage;

public class SignUpTC extends InitiateBrowser
{
	
	@Test
	public void validatesignupfunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_CreateNewAccountbttn();
		sign.enter_firstname("Selenium");
		sign.enter_dob_day("5");
		sign.click_signupbttn();
		
	}
	
	
	
	
}
