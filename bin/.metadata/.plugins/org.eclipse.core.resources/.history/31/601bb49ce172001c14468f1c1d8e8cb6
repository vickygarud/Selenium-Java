package ProgramsPkg;

import java.util.Scanner;

public class PasswordVerifyEx {

	static void validPassword(char pass[]) 
	{
		boolean flag=true;
		int cnt=0;
		int asci=47;
		
		for (int i = 0; i < pass.length; i++) // 65=A, 66=B,...90=Z ASCII value American Standard Code for Information
		{
			
				       if( ('a' <= pass[i] && pass[i] <= 'z') // Checks if it is a lower case letter
                        || ('A' <= pass[i] && pass[i] <= 'Z') //Checks if it is an upper case letter
                        || ('0' <= pass[i] && pass[i] <= '9')
                        || ('!'<= pass[i] && pass[i] <= '/')
                        || (':'<= pass[i] && pass[i] <= '@')
                        || ('['<= pass[i] && pass[i] <= '\'') )
                        {
				    	   flag=false;
                        }
			
		}
		   
		if(flag==false)
			System.out.println("Pass is valid");
		else
			System.out.println("Pass is invalid");
		

	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Password to validate: ");
		String str = sc.next();

		char str1[] = new char[str.length()];

		for (int i = 0; i < str1.length; i++)
		{
			str1[i] = str.charAt(i);
		}
		sc.close();
			validPassword(str1); // call static method without creating any object of class PasswordValidate

		

	}

}
