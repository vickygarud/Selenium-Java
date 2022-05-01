package TCS;

public class InputString {

	static String getString(String input_str)
	{
	
		String s1="";
		for (int i = 0; i<input_str.length(); i++) 
		{
			s1 = s1+input_str.charAt(i);
			String str[] = input_str.split(s1,2);
			System.out.println(str[i]);
		}

		return "str";
	}


	public static void main(String[] args) {

		String input_str = "aeiou";
		String str = getString(input_str);

		System.out.println(str);
	}

}
