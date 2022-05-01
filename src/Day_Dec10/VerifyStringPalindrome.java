package Day_Dec10;

public class VerifyStringPalindrome {

	public static void main(String[] args) {

		String str = "TENETtenet";

		String str1="";
		
			for (int i = str.length() - 1; i >= 0; i--)
			{
				str1=str1+str.charAt(i);
				
			}
			System.out.println(str1);
			
			if(str.equalsIgnoreCase(str1))
				System.out.println(str+" = String is Palindrome");
			else
				System.out.println(str+" String is not palindrome");
	}

}



// O/P - TENETA String is not palindrome 

/*  O/P -
tenetTENET
TENETtenet = String is Palindrome

*/
