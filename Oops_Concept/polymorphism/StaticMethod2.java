package polymorphism;


class SuperClassEx{
	
	 void m1()
	{
		System.out.println("Inside parent class method ");
	}
	
	
}

class DerivedClassEX extends SuperClassEx
{
	 void m1()
	{
		System.out.println("Inside Child class method ");
	}
	
	
}

public class StaticMethod2 {
	public static void main(String[] args) {
		
		SuperClassEx ob = new DerivedClassEX();		// Upcasting
		ob.m1();
		
		DerivedClassEX ob1 = (DerivedClassEX)ob;	// Downcasting
		ob1.m1();
		
		
	}

}

/*
 Inside parent class method 


Static is not part of polymorphism 
 
*/
