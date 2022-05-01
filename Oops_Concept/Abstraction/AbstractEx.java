package Abstraction;

abstract class abc {
	abstract void m1();    
}

class AbstractEx extends abc {

	void m1() {
		System.out.println("Inside m1 Method");
	}

	public static void main(String[] args) {
		abc ob = new AbstractEx();
		ob.m1();
	}

}
