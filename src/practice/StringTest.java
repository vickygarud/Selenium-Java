package practice;

public class StringTest {

	public static void main(String[] args) {

		   String str = "19919954223223";
		// String str = "934834234879612379l";
		// String str = "939683952621395219";
		// String str = "19881954321123";
		 

		// System.out.println(str.length());

		String str1 = "";
		int cnt=0;

		for (int i = 0; i < str.length(); i++)
		{

			if (i % 2 == 0 && i > 2) 
			{
				str1 = str.substring(0, i);
				// System.out.println(str1.length());

				int strSum = 0;
				for (int j = 0; j < str1.length(); j++)
				{
					// System.out.println(str1.charAt(j));
					strSum = (strSum + str1.charAt(j) - '0');
				}

				// System.out.println(strSum);

				int divSum = 0;
				for (int j = 0; j < str1.length() / 2; j++) 
				{
					divSum = (divSum + str1.charAt(j) - '0');
				}
			      // System.out.println(divSum);

				int total = strSum/2;
			

				// System.out.println(total);

				if (total == divSum)
				{
					System.out.println(" String is: " + str1 + " has equal sum of half is: " + total);
					cnt++;
				}
					
			}	
		}
		
		if(cnt==0)
			System.out.println("substring does not have equal some of second half");
	}
}

//7

/*
 * O/P -  String is: 1991 has equal sum of half is: 10
 String is: 199199 has equal sum of half is: 19

 * Problem: given a number find out a substring having maximum length which will
 * satisfy below constraint - sum of all digits of half part of a substring is
 * equal to second half of a substring eg: 19881954321123 ====> 198819
 * 934834234879612379 ====> 423487 961237 939683952621395219 ====> no substring
 * found which satisfy the given constraints 934834234879612379l ====> 423487
 * 961237
 * 
 * 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28
 * 
 * 
 * for(int j=0; j<str.length(); j++) 
 * { System.out.println(str1.charAt(j));
 * 
 * System.out.println(str1); 
 * } 
 * if(i % 2==0 && i>2)
 *  {
 *   str1.substring(14,13);
 * 
 * System.out.println(str1);
 * 
 */