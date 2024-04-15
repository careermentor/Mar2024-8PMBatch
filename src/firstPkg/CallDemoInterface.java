package firstPkg;

public class CallDemoInterface implements DemoInterface 
{

	
	public void meth3() 
	{
		System.out.println("method3");
		
	}

	
	public void meth4() {
		System.out.println("method4");
		
	}


	public void meth5() {
		System.out.println("method4");
		
	}
	
	public static void main(String[] args) {
		CallDemoInterface cd = new CallDemoInterface();
		cd.meth3();
		cd.meth4();
		cd.meth5();
	}

}
