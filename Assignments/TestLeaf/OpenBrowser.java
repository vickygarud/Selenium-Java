package TestLeaf;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenBrowser extends BaseClass {

	/**
	 * To validate checkbox
	 */

	public void leafGroundCheckbox() {
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[7]")).click();
		driver.findElement(By.xpath("//div[@class='example'][1]/input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//div[@class='example'][1]/input[@type='checkbox'][4]")).click();
		driver.findElement(By.xpath("//div[@class='example'][1]/input[@type='checkbox'][5]")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected());
		driver.findElement(By.xpath("(//div[@class='example'])[3]/input[2]")).click();
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='example'])[4]/input"));
		for (WebElement checkBox : list)
			checkBox.click();
	}

	/**
	 * To perform drag and drop operation
	 */

	public void leafGroundDroppable() {
		driver.findElement(By.linkText("Droppable")).click();
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		act.dragAndDrop(source, target).build().perform();

	}
	
	/**
	 * Wait Element Disappearance
	 */

	public void waitForDisappearance() {

		driver.findElement(By.linkText("Wait to Appear")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btn']/b")));
		System.out.println(driver.findElement(By.xpath("//button[@id='btn']/b")).getText());

	}

	/**
	 * To select date in Calendar
	 */

	public void leafGroundCalander() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[12]")).click();
		driver.findElement(By.id("datepicker")).click();
		List<WebElement> days = driver.findElements(By.cssSelector(".ui-state-default"));
		for (int i = 0; i < days.size(); i++) {
			String day = driver.findElements(By.cssSelector(".ui-state-default")).get(i).getText();
			if (day.equalsIgnoreCase("10")) {
				driver.findElements(By.cssSelector(".ui-state-default")).get(i).click();
				break;
			}

		}

		System.out.println(driver.findElement(By.id("datepicker")).getText());
	}

	/**
	 * To upload file
	 */
	public void leafGroundUploadFile() {
		driver.findElement(By.linkText("Upload Files")).click();
		driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:\\Selenium\\demo.txt");
	}

	/**
	 * To perform Auto Complete text suggestion
	 */
	public void leafGroundAutoComplete() {
		driver.findElement(By.linkText("Auto Complete")).click();
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("Re");
		List<WebElement> course = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		for (WebElement option : course) {
			if (option.getText().equalsIgnoreCase("Rest API")) {
				option.click();
				break;
			}
		}
	}

	/**
	 * To handle Alerts
	 */

	public void leafGroundAlert() {
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[9]")).click();

		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result")).getText());

		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("result1")).getText());

		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

	public void leafGroundFrame() {
		driver.findElement(By.linkText("Frame")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='wrapframe'][1]/iframe")));
		driver.findElement(By.id("Click")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("(//div[@id='wrapframe'])[2]/iframe")));
//		driver.findElement(By.cssSelector("#Click1")).click();
		System.out.println(driver.findElements(By.xpath("//div[@id='wrapframe']/iframe")).size());

	}

	/**
	 * Explicit Wait for Alert Appearance
	 */

	public void leafGroundWaitForAlert() {
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[24]")).click();
		driver.findElement(By.id("alert")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

	/**
	 * 
	 * Wait for Disappearance
	 */

	public void leafGroundWaitForDisappearance() {

		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[21]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("btn"))));
		String str = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/p")).getText();
		System.out.println(str);
	}

	/**
	 * To validate Radio Buttons
	 */
	public void leafGroundRadioButtons() {
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[6]")).click();
		WebElement radioButtons = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]"));
		List<WebElement> radioButtonList = radioButtons.findElements(By.cssSelector("input[type='radio']"));
		for (int i = 0; i < radioButtonList.size(); i++) {
			if (radioButtonList.get(i).isSelected()) {
				System.out.println(radioButtonList.get(i).getText() + radioButtonList.get(i).getAttribute("value"));
			}
		}
		driver.findElement(By.xpath("(//input[@name='age'])[2]")).click();

	}

	/**
	 * To verify Edit Text
	 */
	public void leafGroundEdit() {

		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
		driver.findElement(By.id("email")).sendKeys("vicky@gmail.com");
		WebElement text = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/input"));
		text.sendKeys("TextLeaf");
		text.sendKeys(Keys.TAB);
		System.out
				.println(driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[3]/input")).getText());
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		boolean flag = driver.findElement(By.xpath(("(//div[@class='large-6 small-12 columns'])[5]/input")))
				.isEnabled();
		System.out.println(flag);
	}
	
	public void leafGroundImage()
	{
		driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[1]/img")).click();
		driver.navigate().back();
		String url = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/img")).getText();
		
		System.out.println(url.isEmpty());
		
	}

	/**
	 * To perform Drop down operations
	 */

	public void leafGroundDropDown() {
		Select dropDown = null;
		driver.findElement(By.linkText("Drop down")).click();
		dropDown = new Select(driver.findElement(By.id("dropdown1")));
		dropDown.selectByIndex(2);

		dropDown = new Select(driver.findElement(By.name("dropdown2")));
		dropDown.selectByVisibleText("Loadrunner");

		dropDown = new Select(driver.findElement(By.id("dropdown3")));
		dropDown.selectByValue("3");

		dropDown = new Select(driver.findElement(By.cssSelector(".dropdown")));
		List<WebElement> options = dropDown.getOptions();
		for (WebElement op : options) {
			System.out.println(op.getText());
			if (op.getText().contains("Selenium")) {
				op.click();
			}
		}

		WebElement row = driver.findElement(By.xpath("//div[5]//select[1]"));
		row.sendKeys("Sel");
		row.click();

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[6]//select[1]//option[2]"))).click();

	}

	public static void main(String[] args) throws InterruptedException {

		getBrowserInstance("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/");
		OpenBrowser obj = new OpenBrowser();
		obj.leafGroundCheckbox();
		
		//RemoteWebDriver

	}

}

/*
 * Check box 
 * Calendar 
 * Radio Buttons 
 * Edit Text 
 * Drop down 
 * Alert 
 * Wait for Alert
 * Auto Complete Appearance 
 * Wait For disappearance 
 * drag and drop 
 * UploadFile
 * Wait Element Disappearance
 * 
 */
