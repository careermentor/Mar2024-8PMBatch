package firstPkg;

public class FirstClass
{
	int a = 10;   //global variable
	
	
	public void printVar()
	{
		final int a = 20;  //local variable - constant
		//a=30;
		
		float b=20.5f;
		
		char c = 'X';
		String d = "Java";
		
		boolean e = false;
		
		System.out.println(a);  //30
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("This is integer" + a + c);
	}
	
	public void meth2()
	{
		System.out.println(a);  //10
	}
	
	public static void main(String[] args) 
	{
		
		FirstClass abc = new FirstClass();  //create object of the class
		abc.printVar();
	}
	
	
}