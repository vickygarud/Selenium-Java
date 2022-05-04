package amazon.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.BaseClass;

public class AmazonProductList extends BaseClass {

	public static void main(String[] args) {

		getBrowserInstance("chrome");

		driver.navigate().to("https://www.amazon.in/");

		// driver.manage().window().maximize();

		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

		Select option = new Select(dropDown);

		option.selectByVisibleText("Electronics");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("television");
		driver.findElement(By.id("nav-search-submit-button")).click();

		By productList = By.xpath(
				"//div[contains(@class,'s-search-results sg-row')]//div[@class='sg-row']//span[contains(@class,'a-color-base a-text-normal')]");

		List<WebElement> productNames = driver.findElements(productList);

		// list.stream().forEach(s-> System.out.println(s.getText()));

		System.out.println(productNames.size());

		By productListPrice = By.xpath(
				"//div[contains(@class,'sg-col-12-of-20 s-list-col-right')]//span[@class='a-price']//span[@class='a-price-whole']");

		List<WebElement> price = driver.findElements(productListPrice);

		System.out.println(price.size());

		// productNames.forEach(name -> System.out.println(name.getText() + "\n"));
		// price.forEach(name -> System.out.println(name.getText() + "\n"));

		ArrayList<String> al = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < price.size(); i++) {
			System.out.println(productNames.get(i).getText() + " Price: " + price.get(i).getText() + "\n");
			al.add(price.get(i).getText());

		}

		System.out.println(al.size());

		StringBuffer sb = new StringBuffer();

		ArrayList<Integer> amt = new ArrayList<Integer>();

		for (int i = 0; i < al.size(); i++) {

			amt.add(Integer.valueOf(al.get(i).replace(',', ' ').replace(" ", "")));

			map.put(productNames.get(i).getText(), amt.get(i));
			// String str = al.get(i).replace(',', ' ').replace(" ", "");
			// System.out.println(str);
		}

		Collections.sort(amt);

		System.out.println("Minimum Amt: " + amt.get(0) + " Maximum Amt: " + amt.get(amt.size() - 1));

		System.out.println(map.get(5) + " " + map.get(5));

		ArrayList<String> sortedKeys = new ArrayList<String>(map.keySet());
		Collections.sort(sortedKeys);

		// Display the TreeMap which is naturally sorted
		System.out.println("Key = " + sortedKeys.get(0) + ", Value = " + sortedKeys.get(map.size() - 1));

		map.forEach((key, value) -> System.out.println(key + " : " + value));

	}
}

// //div[contains(@class,'s-search-results sg-row')]//span[@class="a-price"]//span[@class="a-offscreen"]        24

//    //div[contains(@class,'sg-col-12-of-20 s-list-col-right')]//span[@class="a-price"]//span[@class="a-offscreen"]   22
//    //div[contains(@class,'s-search-results sg-row')]//div[@class='sg-row']//span[contains(@class,'a-color-base a-text-normal')]     22

////span[@class="a-price"]//span[@class="a-offscreen"]

//  //div[@class='sg-col-inner']//span[@class="a-price"]//span[@class="a-offscreen"]

//  //div[contains(@class,'sg-col-12-of-20 s-list-col-right']//span[@class="a-price"]//span[@class="a-offscreen"]

/*
 * TreeMap<String, Integer> sorted = new TreeMap<>();
 * 
 * // Copy all data from hashMap into TreeMap sorted.putAll(map);
 * 
 * // Display the TreeMap which is naturally sorted for (Map.Entry<String,
 * Integer> entry : sorted.entrySet()) System.out.println("Key = " +
 * entry.getKey() + ", Value = " + entry.getValue()); }
 * 
 */