package DateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatPrint {

	public void m1() {

		System.out.println("Hello");

		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
		System.out.println("DATE: "+date);

		LocalDate myObj = LocalDate.now();

		String d = String.valueOf(myObj);
		System.out.println(d);
	}

	void m2() {
		DateFormatPrint ob = this;

		int result = 6 | 5; // Binary number of 6 = 0110 Binary number of 5 = 0101

		System.out.println(1 % 2);

		/*
		 * 2 / 6 = 0 2 / 3 = 1 2 / 1 = 1
		 * 
		 */
//		0110
//		0101
//		-----
//		0111
//		
		System.out.println(result);
		ob.m1();
	}

	public static void main(String[] args) {

		DateFormatPrint ob = new DateFormatPrint();
		ob.m2();

		Locale locale = new Locale("fr", "FR");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(locale);
//		System.out.print(date);

		String pattern = " HH:mm:ss.SSSZ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(new Date());
//		System.out.println(date);

		LocalDate myObj = LocalDate.now(); // Create a date object
		System.out.println(myObj); // Display the current date

//		    LocalDateTime.now()

		DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formatting: " + myDateObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting: " + formattedDate);

	}
}
