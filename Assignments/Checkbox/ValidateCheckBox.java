package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateCheckBox {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();										// to check option1
		
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());				// to validate is checked or not
			
		driver.findElement(By.id("checkBoxOption1")).click();										//	to uncheck option1
	
		Assert.assertEquals(driver.findElement(By.id("checkBoxOption1")).isSelected(),false);		// expected false here using assertEqual()
		
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected()); 				// expected false here using assertFalse()
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());	// to print no of checkbox present in page
		
		driver.switchTo().alert().accept();

	}
	

}
