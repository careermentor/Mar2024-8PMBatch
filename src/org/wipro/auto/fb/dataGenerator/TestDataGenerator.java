package org.wipro.auto.fb.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf")
	public Object[][] testdata()
	{
		Object[][] data = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //2-d array
		
		return data;
		
	}
	
	
	
}
