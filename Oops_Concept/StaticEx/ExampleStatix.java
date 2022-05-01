package StaticEx;

class first
{
	static void m1()
	{
		System.out.println("****");
	}
}

public class ExampleStatix extends first {
	
	static void m1()
	{
		System.out.println("+++++");
	}
	
	public static void main(String[] args) {
		
		ExampleStatix ob = new ExampleStatix();
		ob.m1();
		
		first ob1 = new ExampleStatix();
		ob1.m1();
		
	}

}
