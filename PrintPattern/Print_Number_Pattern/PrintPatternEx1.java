package Print_Number_Pattern;

public class PrintPatternEx1 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(i);
			System.out.println();
	
		}
		
		System.out.println("\n");
		int i=5; int j=1;
		while(i>=1)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(i);
				j++;
			}
			System.out.println();
			i--;
		}
		
		

	}

}


/*
O/P
55555
4444
333
22
1
*/