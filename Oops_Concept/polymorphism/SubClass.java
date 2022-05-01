package polymorphism;

class BaseClass {
	public void m1() {
		System.out.println("Base Class m1 ");
	}

}

public class SubClass extends BaseClass {

	public void m1() {
		System.out.println("Inside Sub class m1");
	}

	public static void main(String[] args) {
		
		BaseClass b=new SubClass();	//upcasting
		b.m1();
		
		SubClass  p1 = (SubClass) b;	// Downcasting
		
		
	}

}
