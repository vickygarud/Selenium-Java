import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadCreate {

	static void m1() throws IOException {
		FileInputStream fis = new FileInputStream("E:\\vicky\\java.txt");

		FileOutputStream fout=new FileOutputStream("E:\\vicky\\");

		int no;
		/*
		 * while ((no = fis.read()) != -1) { // System.out.print((char)fis.read()+" ");
		 * // System.out.print(no+" ");
		 * 
		 * System.out.print((char) no + " "); }
		 */
		
		  while ((no=fis.read() ) != -1) {
			  // System.out.print((char)fis.read()+" ");
			  // System.out.print(no+" "); 
			  System.out.print((char)no+" ");
			  fout.write(no);
		  
		  }
		 

		fis.close();
		fout.close();

	}

	public static void main(String[] args) {

		try {
			m1();
		} catch (IOException io) {
			System.out.println(io);
			io.printStackTrace();
		}

		System.out.println("Rest code");

	}

}
