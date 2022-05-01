package Day_Dec30;

public class StaticWithinSameClass {
	
	static int a;
	int d=50;
	
	static void print()
	{
		a=20;				//static member directly access from static area within same class
		
		System.out.println("Inside static method whithin same class "+a);
		
	}
	
	 void print1()
	{	
		 
		 System.out.println(d);
		System.out.println(a);
	}
		

	public static void main(String[] args) {
	
		print();						// static method can directly access within same class from static area
		
		StaticWithinSameClass.print();  // or can access with the help of className
		
		//StaticWithinSameClass sc = new StaticWithinSameClass();   // StaticWithinSameClass  object is created
		
		//sc.print();  					// * or with the help of object ****
		
		StaticWithinSameClass sc = new StaticWithinSameClass();
		sc.print1();
		
	}

}


/*

Inside static method whithin same class 20
Inside static method whithin same class 20
Inside static method whithin same class 20


*/