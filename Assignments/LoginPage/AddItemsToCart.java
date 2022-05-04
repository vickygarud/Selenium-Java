package LoginPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemsToCart {

	static void addToCart(WebDriver driver, List<String> items) {

		System.out.println(items);
		System.out.println(items.size());
		List<WebElement> ProductItems = driver.findElements(By.cssSelector("h4.product-name"));
		int cnt = 1;
		for (int i = 0; i < ProductItems.size(); i++) {
			String itemName[] = ProductItems.get(i).getText().split(" ");
			String name = itemName[0].trim();

			if (items.contains(name)) {

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//System.out.println(cnt);

				// System.out.println(driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).getText());

				if (cnt == items.size())
					break;

			}

		}

	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		String[] itemsNeeded = { "Carrot", "Potato", "Apple" };

		List<String> itmes = Arrays.asList(itemsNeeded);

		List<String> product = new ArrayList<>(itmes);
		product.add("Mushroom");
		product.add("Water Melon");

		addToCart(driver, product);

	}

}

/*

[Carrot, Potato, Apple, Mushroom, Water Melon] Banana
[Carrot, Potato, Apple, Mushroom, Water Melon] Grapes
[Carrot, Potato, Apple, Mushroom, Water Melon] Mango
[Carrot, Potato, Apple, Mushroom, Water Melon] Musk
[Carrot, Potato, Apple, Mushroom, Water Melon] Orange
[Carrot, Potato, Apple, Mushroom, Water Melon] Pears
[Carrot, Potato, Apple, Mushroom, Water Melon] Pomegranate
[Carrot, Potato, Apple, Mushroom, Water Melon] Raspberry
[Carrot, Potato, Apple, Mushroom, Water Melon] Strawberry
[Carrot, Potato, Apple, Mushroom, Water Melon] Water
[Carrot, Potato, Apple, Mushroom, Water Melon] Almonds
[Carrot, Potato, Apple, Mushroom, Water Melon] Pista
[Carrot, Potato, Apple, Mushroom, Water Melon] Nuts
[Carrot, Potato, Apple, Mushroom, Water Melon] Cashews
[Carrot, Potato, Apple, Mushroom, Water Melon] Walnuts


*/