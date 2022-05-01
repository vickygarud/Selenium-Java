package Interface;

class ParentClass
{
	
	void m1()
	{
		System.out.println("inside parent class");
	}
	void temp()
	{
		this.m1();
	}
}

class ChildClass extends ParentClass
{
	void m1()
	{
		System.out.println("inside child");
	}
}


public class ThisMethod {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.temp();
		
	}
}
