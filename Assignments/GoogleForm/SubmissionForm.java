package GoogleForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmissionForm {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSfS8S0Qibptw8VocOdWh9HIDjpFyq1fq9etyFiOTKBviKk0Tw/viewform");
		
		driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("vickygarud07");
		
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[type='button'] div[class*='VfPp']")).click();  
		
		
		
		//driver.findElement(By.cssSelector("input[type='date']")).sendKeys("07011998");
	}

}
