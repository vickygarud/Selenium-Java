package polymorphism;

class first
{

	 void m1()
	{
		System.out.println("Inside first class method ");
	}
}

class second extends first
{
	 void m2()
	{
		System.out.println("Inside second class method ");
	}

}

class third extends second 
{
	 void m3()
	{
		System.out.println("Inside third class method ");
	}

}

class Demo {
	
	static void call(second ob)
	{
		third c1 = (third)ob;
		
		c1.m1();
		c1.m2();
		c1.m3();
		
	}

}

public class PassByParameter {
	public static void main(String[] args) {
		
		Demo.call(new third());

	}

}
