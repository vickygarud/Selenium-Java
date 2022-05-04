package Table;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class TableExercise extends BaseClass {

	public static void main(String[] args) {

		BaseClass.getBrowserInstance("chrome");

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)");

		List<WebElement> col = driver.findElements(By.xpath("(//table[@id='product'])[1]//preceding::th"));
		List<WebElement> row = driver.findElements(By.xpath("(//table[@id='product'])[1]//preceding::tr"));

		System.out.println("No of Columns: " + col.size() + " No of row: " + row.size());

		for (int i = 0; i < row.size(); i++) {
			if (i == 2) {
				String rowValue = driver.findElements(By.xpath("(//table[@id='product'])[1]//preceding::tr")).get(i)
						.getText();

				String colValue = driver.findElements(By.xpath("(//table[@id='product'])[1]//preceding::tr")).get(0)
						.getText();
				System.out.println(colValue);
				System.out.println(rowValue);
			}
		}

	}

}

//https://www.rahulshettyacademy.com/AutomationPractice/