package firstPkg;

 public class Calculations
{
	 
	 public Calculations()
	 {
		 System.out.println("this is a constructor");
		 	int a = 20;
			int b = 30;
			int c  =a+b;
			System.out.println("sum of a & b: " + c);
			
	 }
	 
	 public Calculations(int a)
	 {
		 int b = a*a;
		 System.out.println("this is square of a: " + b);
	 }
	 

	public int sum()
	{
		
		int a = 20;
		int b = 30;
		int c  =a+b;
		System.out.println("sum of a & b: " + c);
		return c;
		
	}
	
	public int addition(int a, int b)
	{
		int c  =a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	
	
	//20+30+40
	//int x = 20+30
	//x+40
	
	public static void main(String[] args) 
	{
	
		Calculations cal = new Calculations(20);  //constructor will be called automatically
		Calculations cal1 = new Calculations();
		
		cal1.sum();
		cal.addition(20, 30);
		
	}
	
}
