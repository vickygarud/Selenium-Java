package Day_Dec30;

class firstClass 
{
	int d=40;
	static int a=20;         // static variable
	static void print()		// static method
	{
		a=200;
		System.out.println("Inside firstClass & static print method " +a);
	}

}


class SecondClass
{
	void print(int b)    // non static method
	{
		 int c=firstClass.a;    // access static variable from another class with the help of className ex- firstClass.a;
		
		System.out.println("inside SecondClass & non static method access static variable "+c);  
		System.out.println("Inside SecondClass and non static print method using parameter "+b);
	}
	
	
}

public class StaticWithinAnotherClass { 
	
	public static void main(String[] args)
	{
		firstClass.print();  				 // we can access static member from another class within static area with the help of #ClassName ex.firstClass.print();  
		
		SecondClass sc = new SecondClass();  // SecondClass object created 'sc'
		sc.print(0);							//  we can access non static member from another class within static area with the help of #class object	ex- sc.print();	
		
	//	int b=firstClass.a;   					// we can access static variable from another class with the help of className . variable name
	//	sc.print(b);
		sc.print(firstClass.a);
		
	}

}
