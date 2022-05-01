package Print_Number_Pattern;

public class PrintPatternEx2 {

	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j);
				System.out.println();
		}
		
		System.out.println("\n");
		
		int i=5; 	int cnt=1;
		
		while(i>=1)
		{
			cnt=1;
			while(cnt<=i)
			{
				System.out.print(cnt);
				cnt++;
				
			}
			System.out.println();
			i--;
		}
		
				

	}

}

/*
O/P
12345
1234
123
12
1


12345
1234
123
12
1

*/
