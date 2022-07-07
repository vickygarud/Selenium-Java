package Medly;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BaseClass;

public class Test extends BaseClass {

	public static void main(String[] args) {

		getBrowserInstance("chrome");
		driver.get("https://developer.linkedin.com/");

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			String linkName = list.get(i).getAttribute("href");
			System.out.println(linkName);

		}

		driver.findElement(By.xpath("(//a[@class=' banner-action banner-action-secondary js-analytics-event'])[1]"))
				.click();

		System.out.println(driver.getTitle());

		String actualTitle = driver.getTitle();
		String expectedTitle = "LinkedIn API | Products";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

}
