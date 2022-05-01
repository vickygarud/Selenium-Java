package Inheritance;

class sun{						 
	int star = 100;

	public void m1() {
		System.out.println("\nInside sun class m1(): "+ star);
	}

}

class earth extends sun {
	int e = 200;

	public void m1() {
		super.m1();					// call parent class sun m1()			
		System.out.println("Inside earth class extends sun m1(): " + (e + star));
	}

}

class moon extends sun {
	float m = 1000.0f;

	public void m1() {
		super.m1();					// call parent class sun m1()	
		System.out.println("Inside moon class extends sun m1(): " + (m + star));
	}
}

class blue extends earth {
	int b = 300;

	public void m1() {
		super.m1();					// call parent class earth m1()
		System.out.println("Inside blue class extends earth class m1(): " + (b + star));
	}

}

class white extends moon {
	float w = 2000.0f;

	public void m1() {
		super.m1();					// call parent class moon m1()	
		System.out.println("Inside white class extends moon m1(): " + (w + star));
	}

}

public class InheritanceEx {

	public static void main(String[] args) {
		
		blue ob = new blue();		 // blue -> earth -> sun	blue class object created
		ob.m1();
		
		white ob1 = new white();
		ob1.m1();					// white -> moon -> sun    white class object created
		

		
	}

}
