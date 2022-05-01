package java_constructor;

public class Universe {
	
	Universe()
	{
		int a = 20;
		
	}

	public static void main(String[] args) {
		
		Universe ob = new Universe();
		
		System.out.println(System.identityHashCode(ob) );

		

	}

}
