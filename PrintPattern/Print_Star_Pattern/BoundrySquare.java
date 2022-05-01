package Print_Star_Pattern;

public class BoundrySquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int r=0;r<5;r+=1)
		{
			for(int c=0;c<5;c+=1)
			{
				if (r>0 && c>0 && c<4 && r<4)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}	
			System.out.println();
		}
		
		

	}

}

/* 
 
 
*****
*   *
*   *
*   *
*****
 
 
 
 
 */
