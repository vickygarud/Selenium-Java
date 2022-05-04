package SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseClass;

public class VerifyBrockenLinks extends BaseClass {

	public static void main(String[] args) throws IOException {

		getBrowserInstance("chrome");

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));

		for (WebElement link : links) {
			// System.out.println(link.getText());
			String urlLink = link.getAttribute("href");
			// System.out.println(urlLink);
			URL url = new URL(urlLink);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();

			/*
			 * if(Objects.nonNull(urlLink) || urlLink.startsWith("http")) {
			 * 
			 * }
			 */

			if (respCode > 400) {
				System.out.println("Link: " + link.getText() + "\nUrl: " + urlLink + "\nResponse Code: " + respCode);
			}

		}
	}
}

// HttpURLConnection conn1 = (HttpURLConnection) new URL(urlLink).openConnection();