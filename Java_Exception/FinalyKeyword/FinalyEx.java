package FinalyKeyword;

public class FinalyEx {
	
	
	static void m1()
	{
		
		
		try
		{
			String str1=null;
			System.out.println(str1.length());
			
			try {
				
				String str=null;
				System.out.println(str.length());
			}
			catch(NullPointerException ne)
			{
				System.out.println("Inside Null Pointer");
			}
			
		}
		catch (Exception e) {
			System.out.println("Inside Outer Null Pointer");
		}
		
	
		
		
	}
	public static void main(String[] args) {
		
		try 
		{
			int a = 100/1;
		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("catch block");
//		}
		
		finally{
			System.out.println("Let see execution");
			m1();
		}
		
		
		
		
		
	}

}
