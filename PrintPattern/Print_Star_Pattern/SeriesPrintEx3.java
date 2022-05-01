package Print_Star_Pattern;

public class SeriesPrintEx3 {

	public static void main(String[] args) {

		int star = 1;
		int col = 4;

		while (col >= 1) // outer loop
		{
			star = 1;

			while (star <= col)
			{
				System.out.print("*" + " ");
				star += 1;

			}
			col -= 1;
			System.out.println();

		}
		
		System.out.println("\nUsing for Loop \n");
		
		int row=4;
		
		for(int i=1; i<=4; i++)   //  1<=4 |   2<=4
		{
			
			for(int j=1; j<=row; j++)   //  1<=3 |  2<=3.....3<=3  
			{
				System.out.print("*"+" ");  // 
			}
			
			System.out.println();
			row--;
			
		}
		
		

	}

}

/*
 * * * * * * * *
 * 
 */
