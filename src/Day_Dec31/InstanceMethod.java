package Day_Dec31;

public class InstanceMethod {
	
	
	
	void print()					// instance method
	{
		System.out.println("Inside print method");
		
		display();				// we can call non static method directly within same class
		instance();	   			// call static method directly within same class
		
		second sc = new second();
		sc.instance();				// we can non static method from another class with the help of class object 
	}
	
	void instance()
	{
		System.out.println("inside instance method");
	}
	
	class second
	{
		void instance()
		{
			System.out.println("inside second class instance method");
		}
	}
	
	static void display()
	{
		System.out.println("Inside static mehod");
		
	}

	public static void main(String[] args) {
		
		InstanceMethod im = new InstanceMethod();
		im.print();

	}

}

/*
An instance method can call an instance or static method. It can also access instance or static data variable.
A static method can call a static method only. It can only access a static data variable inside the static method.
A static method cannot invoke an instance method or access an instance variable.




3.We cannot declare a static method and instance method with the same signature in the same class hierarchy.
4. When we create a static method in the class, only one copy of the method is created in the memory and shared by all objects of the class. 
Whether you create 100 objects or 1 object.
5. A static method in java is also loaded into the memory before the object creation.
*/