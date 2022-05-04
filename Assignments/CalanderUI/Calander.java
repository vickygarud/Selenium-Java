package CalanderUI;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calander {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// driver.get("https://www.path2usa.com/travel-companions");
		driver.navigate().to("https://www.path2usa.com/travel-companions");
		// April 23
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

		String month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
				.getText();

		while (!month.contains("May")) {
			month = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']"))
					.getText();
			System.out.println(driver
					.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText());
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("day"));
		// Grab common attribute//Put into list and iterate

		int count = dates.size();

		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("21")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}

		}
	}

}