package polymorphism;

class ParentEx {
	public void m1() {		// overridden
		System.out.println("Super class m1 ** ");
	}

}

 public class ChildEx extends ParentEx {

	public void m1() {   //Overriding m1 method  / overrides polymorphism.parent.m1
		System.out.println("Inside Sub class m1 ++ ");
		
		super.m1();		// calling parent class method using super statement 
	}

	public static void main(String[] args) {
		
		ChildEx ob = new ChildEx();	 //creating an instance of child class 
		ob.m1();					 //calling the method with child class instance  
		
		
		

	}

}


/*
o/p-
Inside Sub class m1 ++ 
Super class m1 ** 

*/