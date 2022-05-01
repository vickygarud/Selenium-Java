package Exception_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputFilter;
import java.nio.file.FileAlreadyExistsException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionExample {
	String str = "";

	public static void main(String args[]) {

		try {
			m1();
		} catch (SQLException e) {
			System.out.println("");
			e.printStackTrace();
		}

	}

	/*
	 * try { throw new MuExceotion();
	 * 
	 * } catch (MuExceotion f) { System.out.println("Cannot divided by zero" ); }
	 * System.out.println("rest of the code...");
	 */

	static void m1() throws InputMismatchException, SQLException {
		Scanner sc = new Scanner(System.in);

		Connection cn = DriverManager.getConnection("");
	}
}