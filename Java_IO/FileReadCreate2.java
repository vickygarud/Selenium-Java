import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadCreate2 {

	static void m1() throws IOException {

			FileInputStream fis = new FileInputStream("E:\\vicky\\java.txt");

			int i;
			/*
			 * while ((i = fis.read()) != -1)
			 *  { 
			 *  System.out.print((char) i);
			 *  }
			 */

			for (i = fis.read(); i != -1; i = fis.read()) {
				System.out.print((char) i);

			}

		System.out.println("\nRest code");
		fis.close();

	}

	public static void main(String[] args) {

		try
		{
			m1();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
