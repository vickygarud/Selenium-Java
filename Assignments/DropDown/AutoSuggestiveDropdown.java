package DropDown;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("in");		//in		// UK
		Thread.sleep(5000);

		List<WebElement> options = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a"));
		// List<WebElements> wes = driver.findElements(By.cssSelector(""))

		for (WebElement option : options) {
			System.out.println(option.getText());									//Ukraine
			if (option.getText().equalsIgnoreCase("Finland")) {						//Finland
				// Thread.sleep(5000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@id='ui-id-1']/li[@class='ui-menu-item']/a")));
				option.click();														// org.openqa.selenium.ElementClickInterceptedException:
				break;
			}
		}
	}
}


/*
Argentina
Bahrain
Benin
Bosnia and Herzegowina
British Indian Ocean Territory
Burkina Faso
China
Cocos (Keeling) Islands
Dominica
Dominican Republic
Equatorial Guinea
Falkland Islands (Malvinas)
Finland

*/