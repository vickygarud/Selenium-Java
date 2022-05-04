package login;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.orangehrm.pages.DashBoardPage;
import com.orangehrm.pages.EmployeeListPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PimPage;
import utils.BaseClass;
import utils.LoginMessages;
import utils.PropertyHandling;

public class LoginTest extends BaseClass {

	PropertyHandling prop;
	LoginPage loginPage;
	DashBoardPage dashboard;
	PimPage pimpage;
	EmployeeListPage empPage;

	@Test(priority = 1)
	public void testLoadHomepage() throws IOException {
		prop = new PropertyHandling();
		getBrowserInstance(prop.getProperty("browser"));
		
		
		System.out.println(prop.getProperty("orangeHrmUsername"));
		driver.navigate().to(prop.getProperty("orgHrmUrl"));
		Assert.assertEquals(prop.getProperty("PageTitle"), driver.getTitle(), "Incorrect page's tittle.");
	}

	@Test(priority = 2)
	public void testLoginInsertCorrectUsernameAndPassword() throws IOException {
		loginPage = new LoginPage();
		dashboard = new DashBoardPage();
		prop = new PropertyHandling();
		getBrowserInstance(prop.getProperty("browser"));
		driver.navigate().to(prop.getProperty("orgHrmUrl"));
		loginPage.login(prop.getProperty("orangeHrmUsername"), prop.getProperty("orangeHrmPassword"));
		assertTrue(dashboard.getWelcomeText().contains(LoginMessages.WELCOMEMSG));
	}

	@Test(priority = 3)
	public void addEmployee() {
		pimpage = new PimPage();
		empPage = new EmployeeListPage();
		pimpage.pimmodule.click();
		empPage.addButton.click();
		empPage.firstName.sendKeys(generateRandomString(5));
		empPage.lastName.sendKeys(generateRandomString(4));
		empPage.saveButton.click();

	}

	@Test(priority = 4)
	public void logOut() {
		loginPage.LogOut();
	}

	@AfterClass
	public void closeDriver() {
//		driver.quit();

	}

}
