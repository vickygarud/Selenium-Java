package Logical_Codes;

public class PrintPattern {

	public static void main(String[] args) {

		int cnt = 2;
		for (int i = 1; i <= 5; i++) 
		{

			for (int j = 1; j <= i; j++) 
			{
				System.out.print(cnt + " ");
				cnt += 2;
			}
			System.out.println();
			cnt += 1;

		}
		

		System.out.println("\n******************* Using While Loop *********************\n");

		int i = 1;
		int no = 2;
		while (i <= 5)
		{
			int j = 1;

			while (j <= i) // 1<=2 2<=2
			{
				System.out.print(no + " ");
				no += 2;
				j++;
			}

			System.out.println();
			no += 1;
			i++;

		}

	}

}

/*

2 
5 7 
10 12 14 
17 19 21 23 
26 28 30 32 34 

******************* Using While Loop *********************

2 
5 7 
10 12 14 
17 19 21 23 
26 28 30 32 34 


 */
