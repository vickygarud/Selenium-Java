package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.accessibility.Accessible;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Implicit Wait - Applicable to all element
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);

		//Explicit Wait - Applicable to specific element only
		WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(5));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		
		
		//Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
		
		// Thread.sleep(5000L); - Always wait until time get complete

		driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();

	}

}
