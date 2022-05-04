package AdminModule;

import java.io.IOException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.orangehrm.pages.AdminPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.PimPage;
import com.orangehrm.pages.TableValue;
import utils.BaseClass;
import utils.ExcelUtil;
import utils.PropertyHandling;

public class ExtractData extends BaseClass {

	PropertyHandling prop;
	LoginPage login;
	AdminPage adminpage;
	TableValue tablevalue;
	PimPage pim;

	@BeforeTest
	public void launchBrowser() throws IOException {
		prop = new PropertyHandling();
		getBrowserInstance(prop.getProperty("browser"));
		login = new LoginPage();
		adminpage = new AdminPage();
		tablevalue = new TableValue();
		pim = new PimPage();
		driver.navigate().to(prop.getProperty("orgHrmUrl"));
		login.login(prop.getProperty("orangeHrmUsername"), prop.getProperty("orangeHrmPassword"));

	}

	/**
	 * To write Admin Page user List in to excel file
	 * 
	 * @throws IOException
	 */
	@Test
	public void getAdminPageUsers() throws IOException {
		String filePath = "E:\\selenium\\ExcelFile\\EmployeeData\\OrangeHrmEmployeeList.xlsx";
		String sheetName = "Admin Users";
		Actions act = new Actions(driver);
		act.moveToElement(adminpage.adminModule).build().perform();
		act.moveToElement(adminpage.UserManagement).build().perform();
		adminpage.users.click();

		// to write data in to excel file
		ExcelUtil.getEmployeeData(filePath, sheetName, tablevalue.totalColumn, tablevalue.totalRows,
				tablevalue.rowValue);

	}

	/**
	 * To write Pim Page employee List in to excel file
	 * 
	 * @throws IOException
	 */

	@Test
	public void getPimPageEmpList() throws IOException {

		String filePath = "E:\\selenium\\ExcelFile\\EmployeeData\\OrangeHrmEmployeeList.xlsx";
		String sheetName = "Pim Employee List";
		Actions act = new Actions(driver);
		act.moveToElement(pim.pimmodule).build().perform();
		pim.empList.click();
		// to write data in to excel file
		ExcelUtil.getEmployeeData(filePath, sheetName, tablevalue.totalColumn, tablevalue.totalRows,
				tablevalue.rowValue);

	}

}
