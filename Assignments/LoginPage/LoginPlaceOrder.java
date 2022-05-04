package LoginPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPlaceOrder {

	// Login Page
	public void login(WebDriver driver, WebDriverWait wait) {

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']/p")));
		System.out.println("Popup: " + driver.findElement(By.xpath("//div[@class='modal-body']/p")).getText());
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		Select options = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		options.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}

	// Place Order
	public void placeOrder(WebDriver driver, WebDriverWait wait) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='card-title']/a"))); // Explicit
																											// Wait
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']/a"));
		String arr[] = { "iphone X", "Samsung Note 8", "Nokia Edge" };
		List<String> ProductItems = Arrays.asList(arr);
		List<String> Addproduct = new ArrayList<>(ProductItems);
		Addproduct.add("Blackberry");

		for (int i = 0; i < Addproduct.size(); i++) {
			if (Addproduct.contains(products.get(i).getText())) {
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			}
		}
	}

	// CheckOut
	public void checkOut(WebDriver driver, WebDriverWait wait) {

		driver.findElement(By.xpath("//li[@class='nav-item active']/a")).click();
		System.out.println(driver.findElement(By.xpath("//h4[@class='media-heading']")).getText());
		System.out.println("Total Amount: " + driver.findElement(By.xpath("//td[@class='text-right']/h3")).getText());
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.id("country")).sendKeys("India");
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='suggestions']/ul"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
			}
		}
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@value='Purchase']")).click();
		System.out.println(
				driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit Wait
		driver.get("https://rahulshettyacademy.com/loginpagePractise");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); // Explicit Wait
		LoginPlaceOrder obj = new LoginPlaceOrder();

		obj.login(driver, wait);
		obj.placeOrder(driver, wait);
		obj.checkOut(driver, wait);
	}

}

/*
 * 
 * O/P-
 * 
 * Popup: You will be limited to only fewer functionalities of the app. Proceed?
 * iphone X Total Amount: ?. 300000 × Success! Thank you! Your order will be
 * delivered in next few weeks :-).
 * 
 * import java.time.Duration; import java.util.List; import
 * java.util.concurrent.TimeUnit; import org.openqa.selenium.By; import
 * org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.Select; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class Assignment2 { public static void main(String[] args) throws
 * InterruptedException { System.setProperty("webdriver.chrome.driver",
 * "/Users/rahulshetty/Documents/chromedriver"); WebDriver driver=new
 * ChromeDriver();
 * driver.get("https://rahulshettyacademy.com/loginpagePractise/");
 * driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
 * driver.findElement(By.id("password")).sendKeys("learning");
 * driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
 * //Thread.sleep(3000); WebDriverWait wait = new WebDriverWait(driver,
 * Duration.ofMillis(7000));
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
 * driver.findElement(By.id("okayBtn")).click(); WebElement options =
 * driver.findElement(By.xpath("//select[@class='form-control']")); Select
 * dropdown = new Select(options); dropdown.selectByValue("consult");
 * driver.findElement(By.id("signInBtn")).click();
 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(
 * "Checkout"))); List <WebElement> products =
 * driver.findElements(By.cssSelector(".card-footer .btn-info")); for(int i
 * =0;i<products.size();i++) { products.get(i).click(); }
 * driver.findElement(By.partialLinkText("Checkout")).click();}
 * 
 * }
 * 
 */
