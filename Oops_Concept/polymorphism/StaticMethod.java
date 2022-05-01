package polymorphism;


class SuperClass{
	
	static void m1()
	{
		System.out.println("Inside parent class method ");
	}
	
	
}

class DerivedClass extends SuperClass
{
	static void m1()
	{
		System.out.println("Inside Child class method ");
	}
	
	
}

public class StaticMethod {
	public static void main(String[] args) {
		
		SuperClass ob = new DerivedClass();
		ob.m1();
		
	}

}

/*
 Inside parent class method 


Static is not part of polymorphism 
 
*/
