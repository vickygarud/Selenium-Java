package Coditas;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

class BaseClass {

	public static WebDriver driver = null;

	/**
	 * To get launch Browser
	 * 
	 * @param browser
	 */

	public static void getBrowserInstance(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		}
	}
}

class GoibiboPage extends BaseClass {

	@FindBy(xpath = "(//p[@class='sc-iIPllB ezZWci fswWidgetPlaceholder'])[1]")
	public WebElement fromLocation;

	@FindBy(xpath = "(//p[@class='sc-iIPllB ezZWci fswWidgetPlaceholder'])[2]")
	public WebElement toLocation;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement textField;

	@FindBy(xpath = "//div[@class='DayPicker-Week']/div/p")
	public List<WebElement> date;

	@FindBy(xpath = "(//ul[@id='autoSuggest-list']/li)//span[@class='autoCompleteTitle ']")
	public List<WebElement> destinations;

	@FindBy(className = "fswTrvl__done")
	public WebElement doneBtn;

	@FindBy(xpath = "//span[@class='sc-fIavCj giPzgn']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//a[@class='sc-dsQDmV iCfezh']")
	public WebElement travelDone;

	@FindBy(xpath = "//div[@class='srp-card-uistyles__SeoCard-sc-3flq99-4 eKhtFD']")
	public List<WebElement> flightList;

	public GoibiboPage() {
		PageFactory.initElements(driver, this);
	}

}

public class Assignment extends BaseClass {

	GoibiboPage goibiboPage;

	public void searchFlights(String fromDest, String toDest, String url, String day) {
		goibiboPage = new GoibiboPage();
		driver.navigate().to(url);
		goibiboPage.fromLocation.click();
		goibiboPage.textField.sendKeys(fromDest);
		getDestination(fromDest);
		goibiboPage.textField.sendKeys(toDest);
		getDestination(toDest);
		selectDate(day);
		
		goibiboPage.travelDone.click();
		goibiboPage.searchBtn.click();
		By oneStopList = By.xpath("//div[contains(@class,'dF justifyBetween')]/div[@class='font12 grey']");
		int cnt = 0;
		for (int i = 0; i < goibiboPage.flightList.size(); i++) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,200)");
			if (!goibiboPage.flightList.get(i).findElements(oneStopList).get(i).getText().isBlank()) {
				By flightName = By.xpath("//div[contains(@class,'-sc-3flq99-4 eKhtFD')]//descendant::span[@class='font13 padL5 black']");
				String name = goibiboPage.flightList.get(i).findElements(flightName).get(i).getText();
				String stop = goibiboPage.flightList.get(i).findElements(oneStopList).get(i).getText();
				System.out.println("Airlines Name: " + name + " " + stop);
				cnt++;
			}
		}

		System.out.println("Total flights from Pune to Bengaluru: " + goibiboPage.flightList.size() + "\n"
				+ "Total flights which have one stop: " + cnt);

	}

	/**
	 * To select date
	 * 
	 * @param day
	 */
	public void selectDate(String day) {
		for (WebElement days : goibiboPage.date) {
			if (days.getText().equals(day)) {
				days.click();
				goibiboPage.doneBtn.click();
				break;
			}
		}

	}

	/**
	 * To select destination place
	 * 
	 * @param dest
	 */

	public void getDestination(String dest) {
		for (WebElement place : goibiboPage.destinations) {
			if (place.getText().contains(dest)) {
				place.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		String fromDest = "Pune";
		String toDest = "Bengaluru";
		String url = "https://www.goibibo.com";
		int currentDay = LocalDateTime.now().getDayOfMonth() + 7;
		String day = Integer.toString(currentDay);
		getBrowserInstance("chrome");
		Assignment obj = new Assignment();
		obj.searchFlights(fromDest, toDest, url, day);

	}

}

/*
 * try { Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_PAGE_DOWN);
 * Thread.sleep(5000); robot.keyRelease(KeyEvent.VK_PAGE_DOWN); } catch
 * (Exception e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * goibiboPage.destinations.forEach(place -> { if(place.getText().contains(dest))
 * { place.click(); } });
 */


/*

O/P-

Airlines Name: SpiceJet Layover - Chennai 7h 35m
Airlines Name: SpiceJet Layover - New Delhi 10h 20m
Airlines Name: SpiceJet Layover - New Delhi 21h 45m
Airlines Name: IndiGo Layover - Hyderabad 6h 55m
Airlines Name: IndiGo Layover - Hyderabad 5h 40m
Airlines Name: IndiGo Layover - Hyderabad 1h 15m
Airlines Name: IndiGo Layover - Goa 1h 15m
Airlines Name: IndiGo Layover - Hyderabad 1h 55m
Airlines Name: IndiGo Layover - Chennai 1h 25m
Airlines Name: IndiGo Layover - Chennai 2h 00m
Airlines Name: IndiGo Layover - Chennai 3h 45m
Airlines Name: Vistara Layover - New Delhi 1h 35m
Airlines Name: IndiGo Layover - Coimbatore 2h 15m
Airlines Name: Air India Layover - New Delhi 3h 40m
Total flights from Pune to Bengaluru: 25
Total flights which have one stop: 14

*/