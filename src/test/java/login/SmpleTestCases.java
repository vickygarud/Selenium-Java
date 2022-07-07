package login;

import org.testng.annotations.Test;
import utils.BaseClass;

public class SmpleTestCases extends BaseClass {

	@Test
	public void testCase() {
		System.out.println("Success Test Case ");
		
		getBrowserInstance(System.getProperty("browser"));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
//		Assert.assertEquals(driver.getTitle(),"Orange");
		
	}

}
