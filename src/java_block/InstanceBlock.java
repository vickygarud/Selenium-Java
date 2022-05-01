package java_block;

public class InstanceBlock {
	
	int a; // instance variable declare

	{
		System.out.println("Instance block a = "+a);
		a=100; //  	instance variable initialized 	
		System.out.println("a = "+a);
	}
	
	{
		System.out.println("Instance block a = "+a);
		a=200;
		System.out.println("a = "+a);
	}
	
	public InstanceBlock()
	{
		System.out.println("Inside Parameteless constructor: "+a); 
		
	}

	public static void main(String[] args) {
		
		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib1 = new InstanceBlock();


	}

}


/*  Parameterizeless

Instance block will execute before constructor call


*/