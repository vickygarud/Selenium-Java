package login;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import utils.BaseClass;

public class SmpleTestCases extends BaseClass {

	@Test
	public void testCase() {
		System.out.println("Success Test Case ");
		
		getBrowserInstance("chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Assert.assertEquals(driver.getTitle(),"Orange");
		
	}

}
