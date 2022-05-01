package TCS;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CountSubstring {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter String: ");
		String str = sc.nextLine();

		String[] str2 = str.split(str, -2);
		
		//Pattern p = Pattern.compile(str2[0]);
		
		for(int i=0; i<str2.length; i++)
			System.out.println(str2[0]);
		
				
		for(String temp: str2)
		System.out.println(temp);
	

	}

}
