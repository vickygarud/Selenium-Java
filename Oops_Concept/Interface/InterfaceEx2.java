package Interface;

import java.util.Collection;

abstract class sun
{
	/*
	 * 
	 Default method allowed only in interface
	 default void method()
	{
		System.out.println("inside method");
	}
	*/
	private void sample1()
	{
		System.out.println("inside private");
	}
	private static void sample2()
	{
		System.out.println("private static");
	}
	
	static void sample3()
	{
		System.out.println(" static");
	}
	
	public void smple4()
	{
		System.out.println(" Instance method");
	}
	
}

 

interface moon
{
	int a=100;				// by default it is public static final int a;
	void m1();				// by default in interface every method is public abstracrt
	
	default void method()
	{
		System.out.println("inside method");
	}
	public default void method1()
	{
		System.out.println("inside method");
	}
	private void sample1()
	{
		System.out.println("inside private");
	}
	private static void sample2()
	{
		System.out.println("private static");
	}
	
	static void sample3()
	{
		System.out.println(" static");
	}
}

public class InterfaceEx2 extends sun implements moon
{
	 public void m1()
	{
		System.out.println("Inside child class");
	}

	public static void main(String args[])
	{
		
		InterfaceEx2 ob = new InterfaceEx2();
		ob.m1();
		ob.method();
	}

	
}

/*
Important points about interface or summary of article:

We can’t create instance(interface can’t be instantiated) of interface but we can make reference of it that refers to the Object of its implementing class.
A class can implement more than one interface.
An interface can extends another interface or interfaces (more than one interface) .
A class that implements interface must implements all the methods in interface.
All the methods are public and abstract.
And all the fields (variable) are public, static, and final.
It is used to achieve multiple inheritance.
It is used to achieve loose coupling.
The interface one cannot define an initializer (static block & instance block)

	 
New features added in interfaces in JDK 9

From Java 9 onwards, interfaces can contain following also
Static methods
Private methods
Private Static methods
 */