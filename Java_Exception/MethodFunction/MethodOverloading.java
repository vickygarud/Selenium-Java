package MethodFunction;

class first {
	void m1() {
		System.out.println("Inside Base class");
	}
}

class second extends first {
	void m1() throws ArithmeticException//,IOException 
	{
		System.out.println("Inside child class");
	}

}

public class MethodOverloading {

	public static void main(String[] args) {
		
		first ob = new second();
		ob.m1();

	}

}


// 