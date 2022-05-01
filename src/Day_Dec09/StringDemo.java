package Day_Dec09;

public class StringDemo {

	public static void main(String[] args) {
		
		
		// white space = space
				String s = "Virat\nKohli";
				System.out.println(s);

		// String is non primitive data type
		// String can have null value
		// String : class jang.lang: basic package

				System.out.println("length of s : " + s.length());
				char ch = s.charAt(4);
				System.out.println(ch);
				ch = s.charAt(5);
				System.out.println("ch=" + ch);
				System.out.println("\n\nchars : ");
				for (int i = 0; i < s.length(); i++)
					System.out.println("i = " + i + " " + s.charAt(i));

				System.out.println("============");
				System.out.println("s.len : " + s.length());
				System.out.println("last char: " + s.charAt(s.length() - 1));

				s = "ms Dhoni";
				System.out.println("second last char: " + s.charAt(s.length() - 2)); // n
				s = "Rohit Sharma";
				System.out.println("second last char: " + s.charAt(s.length() - 2)); // n

		//print string in reverse
				/*
				   for(int i=s.length()-1; i>=0; i--)
				   System.out.print(s.charAt(i));
				 */
		// Rohit Sharma
		// Sharma Rohit
		/*
				int i = s.length() - 1;
				while (i >= 0) 
				{
					System.out.print(s.charAt(i));
					i--;
				}
				System.out.println("i = " + i);
		*/
				System.out.println("Reverse using do while loop: ");
				int i = s.length() - 1;
				do
				{
					System.out.print(s.charAt(i));
					i--;
				}while(i>=0);
				System.out.println("\ni = " + i);

	}

}
