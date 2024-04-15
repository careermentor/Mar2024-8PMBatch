package firstPkg;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class FileHandling 
{

	public static void readProp() throws Exception
	{
		//File f = new File("./TestData/data.properties");
		
		FileReader fr = new FileReader("./TestData/data.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		
		System.out.println(prop.get("Languagae"));
		
		System.out.println(prop.get("URL"));
		
	}
	
	public static void writedata() throws Exception
	{
		File f = new File("./TestData/xyz.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("This is first line");
		fw.flush();
		fw.close();
		
	}
	
	public static void readData() throws Exception
	{
		///C:\Users\Santosh\Desktop\abc.txt
		
		//File f = new File("C:\\Users\\Santosh\\Desktop\\abc.txt");  //connection
		
		File f = new File("./TestData/abc.txt");
		
		FileReader fr = new FileReader(f);
		
		int r = fr.read(); //84
		
		
		
		while(r!=-1) 
		{
			System.out.print((char)r);
			r = fr.read();
		}
		
		
	}
	
	public static void main(String[] args) throws Exception {
		FileHandling.readProp();
		FileHandling.writedata();
	}
	
}
