package polymorphism;

class Sun
{
	double a = 100;
	Sun()
	{
		System.out.println("First");
	}
}

class Earth extends Sun
{
	Earth()
	{
		System.out.println("First");
	}
	
	double a = 200;
	String str = "Earth";
}
class Moon extends Earth
{
	boolean b = false;
	
	void m1(int a)
	{
		System.out.println(a*2);
	}
	
	Moon()
	{
		System.out.println("First");
	}
}

public class MainClass {
	public static void main(String[] args) {
		
		Moon ob = new Moon();
		System.out.println(ob.a);
		ob.m1(10);
		
		Sun obj = (Sun)ob;
		System.out.println(obj.a);
		
		
	}

}


/*

Upcasting is the typecasting of a child object to a parent object.
Upcasting can be done implicitly. Upcasting gives us the flexibility
to access the parent class members but it is not possible to access all 
the child class members using this feature.06-May-2020

*/