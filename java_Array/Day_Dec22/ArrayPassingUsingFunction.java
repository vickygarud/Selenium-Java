package Day_Dec22;

public class ArrayPassingUsingFunction {

	public static String[] copyArray(String[] s)
	{

		String print[] = new String[2];

		print[0] = s[s.length - 1];
		print[1] = s[0];

		return print;
	}
/**
 * Hello world
 * @param s
 */
	public static void printArray(String[] s)
	{

		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}

	}

	public static void main(String[] args) 
	{
		String[] strArr = { "Ravi", "Mahesh", "Robert", "Lisa" };

		String print[] = new String[strArr.length];

		print = copyArray(strArr);

		printArray(print);

	}

}
