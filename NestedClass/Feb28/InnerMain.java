package Feb28;

//package feb28;
class Outer {
	int a = 100;

	Outer() {
		System.out.println("inside constructot");
	}

	void m1() {
		System.out.print("Inside outer - m1");
	}

	class Inner {
		int b = 500;

		public static void main(String[] args) {
			Outer ob = new Outer();
			System.out.println("Hello World!" + ob.a);
			ob.m1();
		}
	}
}

class InnerMain {

	public static void main(String[] args) {
		Outer ob = new Outer();
		System.out.println("Hello World!" + ob.a);

		Outer.Inner ob1 = ob.new Inner();
		System.out.println("Hello World!" + ob1.b);

		Outer.Inner ob3 = new Outer().new Inner();

		System.out.println("Hello World!" + ob3.b);
		// System.out.println("Hello World!" + ob3.a);

	}

}
