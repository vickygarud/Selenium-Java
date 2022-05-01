package Interface;


class Mobile
{
	 int a = 100;
	
	void call()
	{
		System.out.println("Inside Mobile ++");
	}	
	
	void camera ()
	{
		System.out.println("Inside camera ");
	}
	
}

class Samsung extends Mobile
{
	int a = 200;
	int b = 300;
	void call()
	{
		super.call();
		System.out.println("Inside call -- "+super.a);
	}
}

public class Company {
	
	public static void main(String[] args) {
		
		Mobile obj = new Samsung();
	//	Mobile obj = new Samsung();
		
		obj.call();
		obj.camera();
		System.out.println("**"+obj.a);
	//	System.out.println(obj.b);
		
		Samsung ob1 = (Samsung)obj;
		
		System.out.println("++"+ob1.a);
		
		
		
		
		
		
		
		
	}

}
