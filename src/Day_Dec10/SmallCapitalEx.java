package Day_Dec10;

public class SmallCapitalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdefghijklmnopqrstuvwxyz";
		String str1 = "";

		for (int i = 0; i < str.length(); i++)
		{
			str1 = str1 + str.charAt(i);

			if (i % 2 != 0) //
				System.out.print(str1.toLowerCase() + " ");
			else
				System.out.print(str1.toUpperCase() + " ");

			str1 = "";

		}

	}

}

// print small a then capital A, b, C, d...Y, z

// O/P- A b C d E f G h I j K l M n O p Q r S t U v W x Y z 
