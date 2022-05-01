package TCS;

import java.util.*;

public class FindPrimePalindrom {

	static void findPrime(int a, int b) 
	{
		int temp = 0;
		int cnt = 0;
		for (int no = a; no <= b; no++) 
		{
			temp = no;
			cnt = 0;
			for (int j = 1; j < no; j++) {
				if (no % j == 0)
					cnt++;

			}

			int reverse = 0;
			if (cnt == 1) 
			{
				//System.out.println(no);
				while (temp!=0)
				{
					int remainder = temp % 10;  
					reverse = reverse * 10 + remainder;  
					temp = temp / 10;  
				}

			}

			
			if (no == reverse) 
				System.out.println("Number Prime and Palindrome: " + no);

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Lower limit: ");
		int start = sc.nextInt();
		System.out.print("Enter Upper limit: ");
		int end = sc.nextInt();

		findPrime(start, end);

		sc.close();
	}

}

/*
 
Enter Lower limit: 1
Enter Upper limit: 111
Number Prime and Palindrome: 2
Number Prime and Palindrome: 3
Number Prime and Palindrome: 5
Number Prime and Palindrome: 7
Number Prime and Palindrome: 11
Number Prime and Palindrome: 101

 */