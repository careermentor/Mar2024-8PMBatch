package firstPkg;

public class QA1 
{
	
	int x= 20;

	public  void sum(int a, int b)
	{
		int x = 50;
		
		int c  =a+b;
		System.out.println("sum of a&b numbers: " + c);
		
		System.out.println(x);
		System.out.println(this.x);
		
	}
	
	public void sum(int a, float b)
	{
		float c  =a+b;
		System.out.println("sum of a&b numbers: " + c);
		
	}
	
	public void sum(int a, int b, int c)
	{
		int d  =a+b+c;
		System.out.println("sum of a&b&c numbers: " + d);
		
	}
	
	public static void main(String[] args) {
		
		
		QA1 q1 = new QA1();
		q1.sum(20, 30);
		q1.sum(10, 20, 30);
		
	}
	
	
	
}
