package Password;

import java.util.Scanner;

public class PasswordValidate {

	static void pass(String pass) throws PasswordException {
		int cnt = 0;

		try {

			do {

				Scanner sc = new Scanner(System.in);

				System.out.println("Enter Password: ");
				String strPass = sc.next();

				// System.out.println(strPass);

				if (pass != strPass) {
					System.out.println("\nIncorrect Password\n");
					cnt++;
				}
				if (pass.equals(strPass)) {
					System.out.println("Login Successfully..!");
					break;
				}

			} while (cnt != 3);

			if (cnt >= 3) {
				throw new PasswordException();
			}

		} catch (PasswordException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

	}

	public static void main(String[] args) throws PasswordException {

		String pass = "hello123";

		pass(pass);

	}

}



