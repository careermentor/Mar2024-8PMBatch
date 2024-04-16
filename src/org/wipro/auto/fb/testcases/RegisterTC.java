package org.wipro.auto.fb.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.fb.basePkg.InitiateBrowser;
import org.wipro.auto.fb.pages.RegisterPage;

public class RegisterTC extends InitiateBrowser
{
	
	@Test
	public void validateregisterfunc() throws Exception
	{
		RegisterPage reg = new RegisterPage(driver);
		
		reg.click_RegisterLink();
		
	}
	
	
	
	
}
