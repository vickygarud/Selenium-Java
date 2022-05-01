package Exception_Handling;

public class CompileTime {

	static void m1() throws Exception {
		//int arr[] = new int[10000000000000];

	}
	
	static void m2(final int a) {
		
		int b = a;
	
		
	}
	
	CompileTime(final int AI)
	{
			System.out.println(AI);
	}

	public static void main(String[] args) {
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println("");
		}
		
		CompileTime obj = new CompileTime(10);
		CompileTime obj1 = new CompileTime(500);
		
	}

}
