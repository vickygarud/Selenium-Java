package Print_Star_Pattern;

public class PrintTreeEx {

	public static void main(String[] args) {
		
		int space=9;
		
		for(int i=1; i<=20; i+=2)
		{
			
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
			for(int j=1; j<=i; j++)
				
				System.out.print("*");
				System.out.println();
				space--;
				
		}
		
		space=8;
		
		for(int i=1; i<=4; i++)
		{
			
			if(i==4)
			{
				System.out.print("---------------------");
				break;	
			}
			
			for(int j=1; j<=space; j++)
				System.out.print(" ");
			
				for(int j=1; j<=4; j++)
				System.out.print("*");
				System.out.println();
				
				
		}
	}

}




/*
 O/P -
 
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
        ****
        ****
        ****
---------------------

*/
