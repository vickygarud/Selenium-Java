package Interface;

class Parent
{
	void m1()
	{
		System.out.println("Inside Parent class method ++ ");
	}
}

public class FinalDemo extends Parent {
	
	final void m1()
	{
		System.out.println("Inside Parent class method -- ");
	}
	
	public static void main(String[] args) {
		
		FinalDemo obj = new FinalDemo();
		obj.m1();
		
	}

}
