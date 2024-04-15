package firstPkg;

public class SecretClass extends AbsDemo
{

	
	public void meth2() 
	{
		System.out.println("this is credential");
		
	}

	public static void main(String[] args) 
	{
		SecretClass sc = new SecretClass();
		sc.meth1();
		sc.meth2();
	}
	
	
}
