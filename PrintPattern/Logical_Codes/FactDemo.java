package Logical_Codes;

public class FactDemo {

	static int fact(int n)
	{
		System.out.print(n);
		
		return (n <= 1) ? 1 : n * fact(n - 1);  // 6 * 5 =30
		
	}
	
	

	public static void main(String[] args) {
	
	
		int total=1;
		
		
		
		for(int i=6; i>=1; i--)
		{
			
			System.out.print(i);
			if(i>1)
				System.out.print(" * ");
			total=total*i;
		}
		System.out.println(" = "+total);
		
		
		System.out.println(fact(6));
	}

}


// O/P- 6 * 5 * 4 * 3 * 2 * 1 = 720
