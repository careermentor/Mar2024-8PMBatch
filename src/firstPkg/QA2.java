package firstPkg;

public class QA2 extends QA1
{
	int x = 200;

	public void printVal()
	{
		System.out.println(super.x); //20
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)
	{
		int c  =a*a+b*b;
		System.out.println("sum of a&b numbers: " + c);
		
	}
	
	public void sub(int a, int b)
	{
		int c  =a-b;
		System.out.println("sub of a&b numbers: " + c);
		
	}
	
	public static void main(String[] args) {
		
		
		QA2 q2 = new QA2();
		q2.sub(30, 20);
		
		
		q2.sum(20, 30);
		q2.printVal();
		
	}

	
	public void QA1IM() {
		System.out.println("this is QA1I method");
		
	}
	
}
