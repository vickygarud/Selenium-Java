package FillForm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFormMessage {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//for name
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Vicky");
		
		driver.findElement	(By.cssSelector("div[class='form-group'] input[name='email']")).sendKeys("vicky@gmail.com");
		
		driver.findElement(By.xpath("//div[@class='form-group']/input[@id='exampleInputPassword1']")).sendKeys("mypassword");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select dropdowm = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		
		List<WebElement> list = dropdowm.getAllSelectedOptions();
		
		for(WebElement option:list)
			System.out.println(option.getText());
		
		dropdowm.selectByVisibleText("Male");
		
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("01/04/1999");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Success!')]")).getText());
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		System.out.println(driver.findElement(By.tagName("strong")).getText());
		
		
		
		
	}

}
