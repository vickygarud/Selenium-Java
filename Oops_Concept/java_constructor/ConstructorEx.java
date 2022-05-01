package java_constructor;


public class ConstructorEx  {
	int a =100;
	
	static
	{
		System.out.println("static block");
	}
	
	{
		System.out.println("Instance block "+a);
		a= 200;
	}
	ConstructorEx()
	{
		System.out.println("child class constructor " + a);
		a=1000;
	}
	
	ConstructorEx(int x)
	{
		System.out.println("child class constructor " + a);
		a=1000;
	}
	
	public static void main(String[] args) {
		
		ConstructorEx ob = new ConstructorEx();
		
		
		ConstructorEx ob1 = new ConstructorEx(10);
		
		
	}

}
// Parameterized