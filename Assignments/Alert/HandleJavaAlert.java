package Alert;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleJavaAlert {

	public static void main(String[] args) {

		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss"));
		System.out.println(date);
		System.exit(0);
		String text = "Rahul";

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept(); // To accept the alert

		driver.findElement(By.id("confirmbtn")).click();

		// System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss(); // To dismiss the alert

		driver.get("http://leafground.com/");

		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[6]")).click();

		// driver.findElement(By.id("no")).click();

		WebElement radioButtons = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]"));

		List<WebElement> radioButtonList = radioButtons.findElements(By.cssSelector("input[type='radio']"));

		for (int i = 0; i < radioButtonList.size(); i++) {
			if (radioButtonList.get(i).isSelected()) {
				System.out.println(radioButtonList.get(i).getText() + radioButtonList.get(i).getText());

				// radioButtonList.get(i).getText();
			}

		}

	}

}