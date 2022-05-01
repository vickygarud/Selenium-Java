package Match;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ProgramsPkg.SortArray;

public class PatternMatch {
	public static void main(String[] args) {

		String str = "Brocolli - 1 Kg";

		Pattern pattern = Pattern.compile("[a-zA-Z]");

		Matcher match = pattern.matcher(str);

		while (match.find()) {
			String str2 = str.substring(match.start(), match.end());
			System.out.print(str2);
			
			
		}
		
		ArrayList<String> st  = new ArrayList();

		st.add("Water Melon");
		String b = "Water";
		System.out.println(st.contains(b));
		
		
		
	}

}
