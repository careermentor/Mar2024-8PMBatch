package firstPkg;

public class ConstrcutorDemo 
{
	
	public ConstrcutorDemo(int a, int b)
	{
		System.out.println("this is a constructor");
	
		int c = a*b;
		System.out.println(c);
		
	}
	
	public int method1(int a, int b)
	{
		System.out.println("this is a method1");
		
		int c = a*b;
		System.out.println(c);
		return c;
	}
	
	
	public static void main(String[] args)
	{
	
		ConstrcutorDemo cd = new ConstrcutorDemo(20,30);
		
		int x = cd.method1(30,40);
		
	}
	
}
