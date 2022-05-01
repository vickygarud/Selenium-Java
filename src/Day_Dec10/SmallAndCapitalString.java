package Day_Dec10;

public class SmallAndCapitalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(s);

		String str = "";

		for (int i = 0; i < s.length(); i++)
		{
			str = str + s.charAt(i);
			System.out.print(str.toLowerCase() + "" + str.toUpperCase() + " ");

			str = "";
		}

	}

}

/*
 print small a then capital A, b,B,cC...zZ
 O/P -
 
abcdefghijklmnopqrstuvwxyz
aA bB cC dD eE fF gG hH iI jJ kK lL mM nN oO pP qQ rR sS tT uU vV wW xX yY zZ 
  
 */
