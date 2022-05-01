package Abstraction;

abstract class DemoEx
{
	abstract void m2();
	 void m1()
	{
		System.out.println("Inside m1 method ** ");
	}
	
}

public class AbstractEx3 extends DemoEx{
	
	void m2()
	{
		System.out.println("Inside m2 abstract method ** ");
	}
	public static void main(String[] args) {
		
		AbstractEx3 obj = new AbstractEx3();
		obj.m1();		
		obj.m2();
	}
}
