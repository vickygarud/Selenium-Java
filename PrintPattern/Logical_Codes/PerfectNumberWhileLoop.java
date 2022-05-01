package Logical_Codes;

public class PerfectNumberWhileLoop {

	public static void main(String[] args) {

		int no = 1;
		int cnt = 1;

		System.out.println("First 4 Perfect Numbers:");
		while (cnt < 5)
		{
			int sum = 0;
			for (int div = 1; div < no; div++)
			{
				int r = no % div;

				if (r == 0) 
				{
					// System.out.println();
					sum = sum + div;
				}
				
			}

			if (no == sum)
			{
				System.out.println(no+ " Is Perfect Number");
				cnt++;
			}
			else
			{
				//System.out.println();
			}
				no++;
			

		}
	}

}

/*   

First 4 Perfect Numbers:
6 Is Perfect Number
28 Is Perfect Number
496 Is Perfect Number
8128 Is Perfect Number

*/
