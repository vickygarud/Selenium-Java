package StaticBlock;

public class BlockEx {
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		int temp = b;			// temp = 200
		b = a;					// b= 100
		a = temp;				// a  = 200
		System.out.println("a: "+a+" b: "+b);
		
		a = a-b;		// a = 100
		b = a+b;		// 300
		b = a;			//	b = 100
		a = a + b;
		
		System.out.println("a: "+a+" b: "+b);
		
		
	
	}

}
