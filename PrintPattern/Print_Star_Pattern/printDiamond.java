package Print_Star_Pattern;

public class printDiamond {

	public static void main(String[] args) {
		
		int space=4;
		for(int i=1; i<=10; i+=2)
		{
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
			space--;
		}
		space=1;
		
		for(int i=8; i>=1; i-=2)
		{
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
			for(int j=1; j<i; j++)  // 11<=10 
				System.out.print("*");
			
			System.out.println();
			space++;
		}

	}

}


/* 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

 */
			

