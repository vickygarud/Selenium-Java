package java_block;

/*Java program to demonstrate that a static member
can be accessed before instantiating a class
*/
class Test {
	// static method

	static {
		System.out.println("Inside static block"); // static block executed once class is first loaded.
	}

	static {
		System.out.println("static block: will execuited as per top to bottom"); // static block executed once class is first loaded.
	}

	static void m1() {
		System.out.println("from m1 static method");
	}

	public static void main(String[] args) {
		// calling m1 without creating
		// any object of class because its is static it already loaded in heap memory
		m1();
	}
}

/*
 * 
 * If you need to do the computation in order to initialize your static
 * variables, you can declare a static block that gets executed exactly once,
 * when the class is first loaded.
 * 
 * we can have multiple static block order of execution is top to bottom 
 * It will execute once class is loaded in memory
 * 
 */