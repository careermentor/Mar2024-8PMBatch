package org.wipro.auto.fb.utilitiesPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{

	
	
	public static void takingscreenshot(WebDriver driver, String name) throws Exception
	{
		
		TakesScreenshot ts = (TakesScreenshot) driver;    //print screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./TestResults/" + name + ".png");
		
		
		FileUtils.copyFile(f, fd);
		
		
	}
	
}
