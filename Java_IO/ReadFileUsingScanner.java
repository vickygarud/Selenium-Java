import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;

public class ReadFileUsingScanner {

	static String path = "E:\\FileHandling\\Scanner.txt";

	static File file = new File(path);

	static void usingScanner() throws IOException {

		FileInputStream fis = new FileInputStream(file);

		Scanner sc = new Scanner(fis);

		if (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		sc.close();

	}

	static void usingFileInputStream() throws IOException {
		FileInputStream fis = new FileInputStream(file);

		int i; // Declaring loop variable
		System.out.println("Wile Loop..!");
		
		while ((i = fis.read()) != -1) // Holds true till there is nothing to read
			System.out.print((char) i);
		
		
		for (i = fis.read(); i != -1; i = fis.read()) {
			System.out.print((char) i);

		}
		
		
		fis.close();
	}
	
	static void usingFileInputStreamForLoop() throws IOException {
		FileInputStream fis = new FileInputStream(file);

		int i; // Declaring loop variable
		
		System.out.println("\nFor Loop..!");

		for (i = fis.read(); i != -1; i = fis.read()) {
			System.out.print((char) i);

		}
		
		fis.close();
	}
	
	


	public static void main(String[] args) throws IOException {

		usingScanner();
		usingFileInputStream();
		
		usingFileInputStreamForLoop();

	}

}

/*
 * 
 * 
 * 
 * if(!file.exists()) { file.createNewFile(); }
 * 
 * 
 */