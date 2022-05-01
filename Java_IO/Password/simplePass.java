package Password;

import java.util.Scanner;

public class simplePass {
	public static void main(String[] args) {

		String pass = "abcd";

		for (int i = 1; i <= 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Password: ");
			String strPass = sc.next();

			// System.out.println(System.identityHashCode(pass)+"\n"+System.identityHashCode(strPass));

			if (pass.compareTo(strPass) == 0) {
				System.out.println("Login Successfulluy");
				break;
			}

			System.out.println(i >= 3 ? "Account Blocked" : "Password is Incorrect");

		}

	}
}