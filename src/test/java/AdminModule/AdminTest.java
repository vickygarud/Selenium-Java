package AdminModule;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BaseClass;
import utils.ExcelUtil;

public class AdminTest extends BaseClass {

	@Test(dataProvider = "ExcelDataProvider")
	public void loginEx(Object username, Object password) {
		System.out.println("Username: " + username + " Password: " + password);
	}

	@DataProvider(name = "ExcelDataProvider")
	public Object[][] getData() throws IOException {
		String path = "E:\\selenium\\ExcelFile\\InputData.xlsx";
		return ExcelUtil.getExcelData(path, "Testdata");
	}

}
