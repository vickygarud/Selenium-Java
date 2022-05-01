package Print_Number_Pattern;

public class SeriesTopToBottom {

	public static void main(String[] args) {
		
		int i=5; int j=1;
		
		while(j <= 5)
		{
			i=5;
			while(i>=j)
			{
				System.out.print(i+" ");
				i--;
			}
				System.out.println();
				j++;
		}
		
		System.out.println("\n***Using for Loop***\n");
		
		
		
		for(int m=1; m<=5; m++)
		{
		
			for (int k=5; k>=m; k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
		

	}

}

/* 
o/p -
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 

***Using for Loop***

5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 


*/