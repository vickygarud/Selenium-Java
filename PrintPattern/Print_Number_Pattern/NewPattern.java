package Print_Number_Pattern;

public class NewPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cnt=1;
		int row=1;
		
		while(cnt<=10)
		{
			row=1;
			while(row <= cnt)
			{
				System.out.print("*");
				row++;
			}
				cnt+=1;
				System.out.println();
				
			
		}
		cnt=1;
		row=1;
		int j=10;
		while(j>=1)
		{
			 row=1;
			while(row <= j)
			{
				System.out.print("*");
				row++;
			}
			System.out.println();
			j--;
	}

}

}


/*
 
 O/P-
 
     
*  
**
***
****
*****
******
*******
********
*********
**********
**********
*********
********
*******
******
*****
****
***
**
*

*/
