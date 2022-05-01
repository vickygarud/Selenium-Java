package java_block;

public class StaticBlock {

	
	static
	{
		System.out.println("Inside static block");
	}
	static void m1(String arr[])
	{
		
		System.out.println("Inside m1 method");
		for(String str: arr)
			System.out.println(str);
		
	}
	public static void main(String[] args) {
		m1(args);
	
	}

}
