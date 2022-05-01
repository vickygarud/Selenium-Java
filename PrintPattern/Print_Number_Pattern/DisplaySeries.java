package Print_Number_Pattern;

public class DisplaySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int row=1;
		
		while(row<=5)
		{
			i=1;
			while(i<=row)
			{
				System.out.print(i+" ");
				i++;
			}
			
			System.out.println();
			row++;
			
		}
		
		

	}

}
/* 
 O/P - 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
