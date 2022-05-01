package Interface;

interface Edit
{
	void m1();
	
}

class Example implements Edit
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class FinalObject implements Edit {
	public void m1()
	{
		System.out.println("Hello world");
	}
	
	
	public static void main(String[] args) {
		
	  final  Edit ob = new FinalObject();
		ob.m1();
		
		// ob = new Example(); The final local variable ob cannot be assigned. It must be blank and not using a compound assignment
	}

	
}
