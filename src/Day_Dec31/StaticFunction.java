package Day_Dec31;


class one
{
	
	static void secondPrint()
	{
		System.out.println("Inside *** one *** secondPrint method ");
	}
	
	void print()
	{
		System.out.println("inside one method: ");
	}
	
	
}

public class StaticFunction extends one {

	void print()
	{
		System.out.println("inside print method: ");
	}
	
	static void secondPrint()
	{	
		System.out.println("Inside secondPrint method ");
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		StaticFunction sf = new StaticFunction();
		
		sf.print();
		one.secondPrint();
		secondPrint();
		
		
	}

}
