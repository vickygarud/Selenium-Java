package Print_Number_Pattern;

public class DisplayReverseNumSeries {

	public static void main(String[] args) {
	
		
		
		// while loop *************************
	    int j=5;
		
		while(j >= 1)
		{
			int i=1;
			while(i <= j)  // j=2
			{
				System.out.print(i+" ");
				i++;
			}
				System.out.println();
				j--;
			
		}
	
		System.out.println();
		
		
		// for loop *************************
			for(int i=5; i>=1; i--)
			{
				
				for(int cnt=1; cnt<=i; cnt++)
				{
					System.out.print(cnt+" ");
				}
				
				System.out.println();
			}

			System.out.println();
			
			
			// while loop ********************
			
			int no=1;
			
			while(no<=5)
			{
				int x=1;
				while(x<=no)
				{
					System.out.print(x+" ");
					x++;
				}
				
				System.out.println();
				no++;
			}
			
			System.out.println();
			
			
			
			
			// for loop *********************
			
			for(int i=1; i<=5; i++)
			{
				
				for(int cnt=1; cnt<=i; cnt++)
				{
					System.out.print(cnt+" ");
				}
				
				System.out.println();
			}
			
			
	}

}

/* o/p
  1 2 3 4 5 
  1 2 3 4 
  1 2 3 
  1 2 
  1        */ 

