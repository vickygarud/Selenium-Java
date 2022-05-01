package Java_HashCode;

public class ConstructorHashCode {
	
	ConstructorHashCode(){
		
		System.out.println("Hello constructor ");
	}
	public static void main(String[] args) {
		
		ConstructorHashCode ob = new ConstructorHashCode();
		int a;
		a=300;
		System.identityHashCode(ob);
		System.out.println();
		System.out.println();
		System.out.println(a);
		System.out.println(ob);
		
	}

}
