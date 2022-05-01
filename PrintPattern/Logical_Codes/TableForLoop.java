package Logical_Codes;

public class TableForLoop {

	public static void main(String[] args) {
		
		int cnt=2;
		
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.print(String.format("%4d",(j*cnt))+" ");
			}
				System.out.println();
				cnt++;
		}
		
	
		

	}

}


/* 

   2    4    6    8   10   12   14   16   18   20 
   3    6    9   12   15   18   21   24   27   30 
   4    8   12   16   20   24   28   32   36   40 
   5   10   15   20   25   30   35   40   45   50 

*/