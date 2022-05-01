package java_constructor;

public class ConstructorDemo {
	
	static int a=100;
	ConstructorDemo(int c){
	
		this.a=c;
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		new ConstructorDemo(10);
		ConstructorDemo cd = new ConstructorDemo(a);
	}

}
