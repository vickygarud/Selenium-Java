package Print_Star_Pattern;

public class PrintStarPattern {

	public static void main(String[] args) {

		int cnt=1;
		
		for (int i = 1; i <= 5; i++)
		{

			for (int j = 1; j <= 5-i; j++)
				System.out.print(" ");
				
			for (int j = 1; j <= cnt; j++)
				System.out.print("*");
			
			cnt+=2;
			System.out.println();
			
	
		
	/*	int row=5;
		for(int i=1; i<=row; i++)
		{
			
			if(i==1 || i==5)
			{
			for(int j=1; j<=row; j++)
				System.out.print("*");
			}
			else
			for(int j=1; j<=row; j++)
			{
				if(j==1 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
						
			System.out.println();*/

		}

	}

}


/*
 *****
 *   *
 *   *
 *****
 


*/