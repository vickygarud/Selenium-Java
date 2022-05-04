package CalanderUI;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AirIndia {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to("https://www.airindia.in/");
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//img[@title='Date Picker'])[2]")).click();

		String returnMonth = driver
				.findElement(By.cssSelector("div[class*='clearfix ui-corner-right'] span[class='ui-datepicker-month']"))
				.getText();

		while (!(returnMonth.contains("September"))) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			returnMonth = driver
					.findElement(
							By.cssSelector("div[class*='clearfix ui-corner-right'] span[class='ui-datepicker-month']"))
					.getText();

		}

		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-hover']")).click();

		List<WebElement> day = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//a"));

		for (int i = 0; i < day.size(); i++) {

			String dateText = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//a")).get(i)
					.getText();

			if (dateText.equalsIgnoreCase("14")) {
				driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[2]//a")).get(i).click();
			}

		}
		
		String date = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]/span")).getText();
		
	System.out.println("Selected Date: "+date);
	}

	
}
