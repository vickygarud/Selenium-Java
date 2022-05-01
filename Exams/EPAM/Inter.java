package EPAM;

class A{
	
	static int print(int x)
	{
		return x*2;
	}
}


public class Inter extends A {
	int a = 200;

	public static void main(String[] args) {
		
		A obj = new Inter();
		
		Inter obj1 = (Inter)obj;
		
		System.out.println(obj1.a);
		
		int z=5;
		
		assert z>2: print(z);
		
		
		System.out.println(z);

	}

}
