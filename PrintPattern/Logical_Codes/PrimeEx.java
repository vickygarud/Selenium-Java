package Logical_Codes;

public class PrimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		while (i <= 20) 
		{
			int no = i;
			boolean flag = false;
			for (int cnt = 2; cnt <= no - 1; cnt++) // 2 3 4 5
			{
				int r = no % cnt;
				if (r == 0)
				 {
					//System.out.println("No " + no + " is not a prime");
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.println("No " + no + " is a prime");

			i++;

		}



	}

}
