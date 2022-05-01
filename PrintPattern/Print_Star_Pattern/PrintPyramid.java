package Print_Star_Pattern;

public class PrintPyramid {

	public static void main(String[] args) {
		
		int space=4;
		int i=1;
		for(int row=1; row<=5; row++)
		{
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
			i+=2;
			space--;
		}
		
		
		
	}
}

/*
 
    *
   ***
  *****
 *******
*********

*/