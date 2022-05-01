package Print_Number_Pattern;

public class NestedWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int col=2; int i=1; int j=5;
		
		
		while(col<=5)
		{
			i=1;
			while(i<=j)
			{
				System.out.print((i*col)+" ");
				i++;
				//break;
			}
			
			System.out.println();
			col++;
			j=3;
		}

	}

}																												
// 2 4 6 8 10 
// 3 6 9 
// 4 8 12 
// 5 10 15 
