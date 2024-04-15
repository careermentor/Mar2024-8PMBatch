package firstPkg;

public class KeywordsDemo 
{

	int x = 20;  //global
	
	public void printVal()
	{
		final int x=50;  //local
		//x=100;
		
		System.out.println(x);  //50
		
		System.out.println(this.x); //20
		
	}
	
}
