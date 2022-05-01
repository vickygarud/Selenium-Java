package Inheritance;

class first {
	first() 
	{	
		System.out.println("Inside first class parameterless constructor ");
	}
	first(int a)
	{
		System.out.println("Inside first class Parameterized constructor: "+a);
	}

}

class second extends first {
	second()
	{		// by default compiler add super() and call first class "Default Constructor/ 0 args"
		System.out.println("Inside SECOND class parameterless constructor ");
	} 

	second(String a) 
	{
		System.out.println("Inside SECOND class Parameterized constructor: "+a);
	}

}

public class SuperDemo {

	public static void main(String[] args) {
		
		second ob = new second();
		
		second ob1 = new second("01");
		


	}

}

/*
Inside first class parameterless constructor 
Inside second class parameterless constructor 

*/