package Abstraction;

abstract class Demo
{
	abstract void m2(AbstractEx2 ob);
	 int a = 10;
	  void m1()
	{
		System.out.println("Inside m1 method ");
	}
	
}

public class AbstractEx2 extends Demo{
	
	void m2(AbstractEx2 ref)
	{
		System.out.println("Inside m2: " + ref.a);
		
	}
	public static void main(String[] args) {
		
		AbstractEx2 obj = new AbstractEx2();
		obj.m1();		
		obj.m2(obj);
		
	}
}
