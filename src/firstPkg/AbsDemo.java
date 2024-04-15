package firstPkg;

public abstract class AbsDemo   ///abstract class
{
	public void meth1()    //concrete method
	{
		int a = 20;
		a=30;
		
		System.out.println("This is is concrete method");
		System.out.println(a);
	}
	
	

	
	
	public abstract void meth2(); 
	
	
	public static void main(String[] args)
	{
		//AbsDemo ad = new AbsDemo();
		//ad.meth1();
		//ad.meth2();
	}
}
