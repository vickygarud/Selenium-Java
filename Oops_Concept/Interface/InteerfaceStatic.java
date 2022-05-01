package Interface;

interface sim
{
	void m1();
	static void m2()
	{
		System.out.println("Interface static method ** ");
	}
}

class second implements sim
{
	public void m1()
	{
		System.out.println("Inside m1 method ++ ");
	}	
}
public class InteerfaceStatic {
	
	public static void main(String[] args) {
		
		second ob = new second();
		
		ob.m1();
		sim.m2();
		
	}

}
