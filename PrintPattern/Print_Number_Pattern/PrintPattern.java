package Print_Number_Pattern;

public class PrintPattern {

	public static void main(String[] args) {
		
		
		for(int i=5; i>=1; i--)
			{
				for(int j=1; j<=5; j++)
				System.out.print(i);
				System.out.println();
				
				
			}
		
		System.out.println("\n");
		int i=5;
		while(i>=1)
		{
			int j=1;
			while(j<=5)
			{
				System.out.print(i);
				j+=1;
			}
			System.out.println();
			i-=1;
		}
			
		

	}

}

/*
o/p -
55555
44444
33333
22222
11111
*/
