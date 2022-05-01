package Inheritance;

class parent
{
	{
		System.out.println("Inside Instance Block");
	}
	parent()
	{
		System.out.println("Inside parent class constructor: ");
	}

}

public class InheritanceDemo extends parent {
	
	InheritanceDemo()
	{
		System.out.println("Inside InheritanceDemo Class: ");
	}

	public static void main(String[] args) {
		
		InheritanceDemo id = new InheritanceDemo();
		parent ob = new parent();
	}

}

/*

parent class constructor will execute form before child class
*/