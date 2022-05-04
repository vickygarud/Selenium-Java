package TestLeaf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver = null;
	
	
	/**
	 * To launch browser
	 * @param browser
	 */

	public static void getBrowserInstance(String browser) {

		switch (browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
	}

}
