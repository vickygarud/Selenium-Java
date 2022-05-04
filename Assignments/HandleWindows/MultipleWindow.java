package HandleWindows;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.linkText("Multiple Windows")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();

		String one = it.next();
	    //String two = it.next();

		driver.switchTo().window(it.next());

		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());

		driver.switchTo().window(one);

		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}
}