package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitiateBrowser;
import org.wipro.auto.fb.dataGenerator.TestDataGenerator;
import org.wipro.auto.fb.pages.LoginPage;

public class LoginScenario extends InitiateBrowser
{
	
	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void validateloginfunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
	
}
