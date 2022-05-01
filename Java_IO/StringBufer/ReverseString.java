	package StringBufer;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("TSRQP");

		System.out.println(sb.reverse());

		for (int i = sb.length() - 1; i >= 0; i--) {
			
			String str = Character.toString(sb.charAt(i));
			System.out.print(str);
		}
		
		
		boolean flag = !"May 2022".contains("May");
		
		System.out.println(flag);
		
		
		String st = "abc";
		
		
		StringBuffer sb2 = new StringBuffer(st);
		
		sb2.charAt(0);
			
		 char x[] = st.toCharArray();
	     char y[] = st.toCharArray();
	     
	    
	     
	     ArrayList al = new ArrayList();
	    al.size(); 
	     al.add(st);
	     
	     
	    

	}

}



//Character.toString(c);