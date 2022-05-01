package Abstraction;

abstract class Example {

	Example() {
		System.out.println("Inside abstract class constructor");
	}

}

public class AbstractConstructEx4 extends Example{

	AbstractConstructEx4() {
		//super();
		System.out.println("Inside normal class constructor");

	}

	public static void main(String[] args) {
		
		AbstractConstructEx4 ob = new AbstractConstructEx4();

	}

}
