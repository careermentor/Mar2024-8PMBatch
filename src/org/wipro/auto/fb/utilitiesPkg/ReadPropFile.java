package org.wipro.auto.fb.utilitiesPkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropFile 
{

	public static String readconfigprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	public static String readelementprop(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/Element.properties");
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
}
