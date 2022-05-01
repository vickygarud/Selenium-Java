import java.io.FileInputStream;

import java.io.IOException;

public class FileRead {

	static void m1() throws IOException {
		FileInputStream isr = new FileInputStream("E:\\vicky\\java1.txt");
	}

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream isr = new FileInputStream("E:\\vicky\\java.txt");
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		try {
			m1();
		}
		catch(IOException ie){
			System.out.println();
		}

		System.out.println("Rest code");
	}
}


/*
 * When an exception is thrown using the throw keyword, the flow of execution of the program is stopped and 
 * the control is transferred to the nearest enclosing try-catch block that matches the type of exception thrown.
 *  If no such match is found, the default exception handler terminates the program
 *  
 *  No, we can not place any code after throw statement, it leads to compile time error Unreachable Statement.
 *  
 *  The throw keyword is used to throw an exception explicitly. It can throw only one exception at a time. 
 *  The throws keyword can be used to declare multiple exceptions, separated by a comma.
 *   Whichever exception occurs, if matched with the declared ones, is thrown automatically then
 *   
 *   
 *  What is throw and throws in Java with example?
 *  The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
 *  We can throw either checked or unchecked exception. 
 *  The throw keyword is mainly used to throw custom exceptions
 */


