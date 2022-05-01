
package ProgramsPkg;

	

	/*
	 * Problem: given a number
	 * find out a substring having maximum length which will satisfy below constraint
	 *  - sum of all digits of half part of a substring is equal to second half of a substring 
	 * eg:
	 * 19881954321123      ====> 198819
	 * 934834234879612379  ====> 423487961237
	 * 939683952621395219  ====> no substring found which satisfy the given constraints
	 * 934834234879612379l ====> 423487961237
	 */
	public class FindLongestSubstringOfDigits2
	{

		public static void main(String[] args)
		{
	 
				long c= 111111111111l;
			  long no = 93483423879612379l;
			//long no = 939683952621395219l;
			//long no = 934834234879612379l;
			//long no = 19881954321123l;
			//long no = "0985858285851383";
			
			String str = String.valueOf(no);
			
			System.out.println(str);
			
			
			int lInd = str.length();
			int maxLen = Integer.MIN_VALUE;
			
			System.out.println(maxLen);
			String maxSubString1="", maxSubString2="";
			
			/*logic:
			 * scan main string from 1 to length
			 * scan main string from 1 length-1, length-2...until 1 = 1
			 * once above all strings are scanned
			 * scan string from 2 to length, 2 to length-1, length-2, length-2... 2 until =2
			 * scan string from 3 to length, 2 to length-1, length-2, length-2... 3 until =3
			 * scan string from 3 to length, 2 to length-1, length-2, length-2... 2 until =2
			 * scan string from length-2 to length-1 until =length-1
			* for every substring found - 
			* if substring is of even length 
			*  divide it into 2 parts, find every digit and sum it from first part of substring
			*  find every digit and sum it from second part of substring
			*  if sum of first part and sum of second part is equal compare that with length 
			*  prior max sub string found and declare store this new substring and its length 
			*  in max  sub string to compare for subsequent substring which will satisfy above 
			*  conditions
			*/ 
			for(int i=0; i<str.length(); i++)
			{
				lInd = str.length();
				for(int sInd=i; sInd<lInd; lInd--)
				{
	 				String ss1 = str.substring(sInd, lInd);
	 			
					String ss = findSubStrWhichSatisfyConstraint(ss1);				
					if (!(ss.equals("ODDLENGHSTRING")) && (!ss.isEmpty()) 
							&& (ss.substring(0,ss.indexOf("#")).length() > maxLen 
									&& ss.length() > 1))
					{	 
						System.out.println("internal max substring found : " + ss);
						maxSubString1 = ss.substring(0,ss.indexOf("#"));
						maxSubString2 = ss.substring(ss.indexOf("#")+1);
						maxLen = ss.substring(0,ss.indexOf("#")).length();
					}
				}
			}
			if (!maxSubString1.isEmpty())
				System.out.println("Max substringwith constraints :" + maxSubString1+maxSubString2);
			else
				System.out.println("Max substringwith with given constraints not found");
				
		}
		
		
	 /**
	  * finds a sub string which has sum of every digit is equal to half part of other substring
	  * 
	  * @param ps: passed string
	  * @return Substring with equal sum of all digits for both substrings with same length
	  */
		public static String  findSubStrWhichSatisfyConstraint(String ps)
		{
	 		if (ps.length()%2 != 0)
				return "ODDLENGHSTRING"; //length is odd in length so can't divide into 2 parts
			else
			{
				
	 			int halfLen = ps.length()/2;
	 			String ssPart1 = ps.substring(0, halfLen);
	 			String ssPart2 = ps.substring(halfLen, ps.length());
	 
				int part1Total = findAdditionOfStringPart(ssPart1);
				int part2Total = findAdditionOfStringPart(ssPart2);
	 			
				if (part1Total == part2Total)
					return ssPart1+"#"+ssPart2;  // 2 parts are same
				else
					return "";  // 2 parts are not same
			}
		}
		
		
		/**
		 * Finds addition of a each number stored in a string
		 * 
		 * @param ssPart1
		 * @return
		 */
		public static int findAdditionOfStringPart(String ssPart1)
		{
			int no = Integer.parseInt(ssPart1);
			int sum = 0;
			while(no>0)
			{
				int r = no%10;
				sum = sum + r;
				no = no / 10;
			}
			return sum;
		}
	
	

}
