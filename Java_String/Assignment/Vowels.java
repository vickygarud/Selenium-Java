package Assignment;

public class Vowels {

	public static void main(String[] args) {

		String str1 = "aeiouABCD";
		int vow = 0;
		int con = 0;

		String str = str1.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vow++;
			} else
				con++;
		}

		System.out.println("vowels: " + vow + " Consonents: " + con);

	}
}
