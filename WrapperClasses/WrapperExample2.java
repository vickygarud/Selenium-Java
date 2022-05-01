public class WrapperExample2 {

	public static void main(String args[]) {

		 // Converting Integer to int

		Integer b = Integer.valueOf(100);	
		
		System.out.println();

		Integer a = new Integer(3);
		int k = a.intValue(); // converting Integer to int explicitly
		int j = a;// unboxing, now compiler will write a.intValue() internally
		
		
		int x = 200;
		
		Integer xx = new Integer(x);
		
		Integer z = Integer.valueOf(x);
		
		System.out.println(z.toString());

		
	}
}