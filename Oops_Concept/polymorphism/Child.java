package polymorphism;

class Parent
{
	int a = 200;
	boolean flag = true;
	public void m1() // overridden
	{		
	System.out.println("Super class m1 ** ");
	flag = false;
	}

}

public class Child extends Parent {
	int a = 5000;
	float b = 40.03f;
	
	//Overriding m1 method  / overrides polymorphism.parent.m1
	public void m1()	
	{   
		System.out.println("Inside Sub class m1 ++ ");
		System.out.println(flag);
		//super.m1();														// calling parent class method using super statement 
	}
	
	public void m2()
	{
		System.out.println("Inside sub class m2 method @@@ ");
	}

	public static void main(String[] args) {
		
		Parent ob = new Child();	 	                                            				//creating an instance of child class 
		ob.m1();										//calling the method with child class instance  
		System.out.println("parent class var: "+ob.a);
		//System.out.println("parent class var: "+ob.b);
		//ob.m2();
		
		//System.out.println(ob.b);
		
		Child c1 = (Child) ob;
		
		boolean res = ob == c1;
		System.out.println("Result "+res);
	//	System.out.println(c1.b+" "+c1.a);
		c1.m1();
		
		
		
		
	}

}


/*
o/p-
Inside Sub class m1 ++ 
Super class m1 ** 

*/