package Logical_Codes;

public class printPascal {

	public static void main(String[] args) {

		int row = 5, i, j, space, num;
		for (i = 0; i < row; i++)
		{
			for (space = row; space > i; space--) 
			{
				System.out.print(" ");
			}
			num = 1;
			for (j = 0; j <= i; j++)
			{
				System.out.print(num + " ");     // 1
				num = num * (i - j) / (j + 1);	//  
			}
			System.out.print("\n");
		}
				System.out.println("\nprint Pattern\n");
		
		
		for(int x=0; x<=5; x++)
		{
			if(x==1)
				continue;
			
			int cnt=1;
			for(int y=0; y<=x; y++)
			{
				System.out.print(cnt+" ");
				cnt = cnt * (x-y) / (y+1);	
			}
			System.out.println();	
		}
	}
}

/*
 
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 

 */

/*

1
1 2 1
1 3 3 1
1 4 6 4 1
1 10 10 5 1





1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 

*/