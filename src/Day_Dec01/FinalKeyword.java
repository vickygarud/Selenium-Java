package Day_Dec01;

public class FinalKeyword {
	
	static void m1(final int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		
	}
	
	
	
	public static void main(String[] args) {
		
		FinalKeyword ob = new FinalKeyword();
		ob.m1(10);
		ob.m1(20);
		
	}

}
