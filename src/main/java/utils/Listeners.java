package utils;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends BaseClass implements ITestListener, ISuiteListener {

	@Override
	public void onStart(ISuite suite) {

		String screenshot = System.getProperty("user.dir") + "\\Screenshot\\";
		String extentReport = System.getProperty("user.dir") + "\\Reports\\";
		createFolder(screenshot);
		createFolder(extentReport);
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss"));
		htmlReporter = new ExtentSparkReporter(extentReport + "OrangeHrmTestReport" + date + ".html");

		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.getReport();
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);

		extentReports.setSystemInfo("Browser", "Chrome");
		extentReports.setSystemInfo("OS", "Windows");
		extentReports.setSystemInfo("Tester", "root");

	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub

		driver.quit();
		ISuiteListener.super.onFinish(suite);
	}

	@Override
	public void onTestStart(ITestResult result) {
		logger = extentReports.createTest(result.getMethod().getMethodName());
		logger.getStatus();

		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentReports.createTest(result.getMethod().getMethodName());

		logger.log(Status.PASS, "Test case pass: " + result.getMethod().getMethodName());
		htmlReporter.getReport();
		ITestListener.super.onTestSuccess(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger = extentReports.createTest(result.getMethod().getMethodName());

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);

		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss"));

		String folderPath = System.getProperty("user.dir") + "\\Screenshot\\" + result.getMethod().getMethodName()
				+ date + ".png";

		try {
			FileUtils.copyFile(src, new File(folderPath));
		} catch (IOException e) {

			e.printStackTrace();
		}
//		logger = extentReports.createTest(result.getMethod().getMethodName());
		extentReports.attachReporter(htmlReporter);
		logger.fail(result.getMethod().getMethodName());
		logger.fail(result.getThrowable());
		logger.fail("failed");
		logger.addScreenCaptureFromPath(folderPath);
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extentReports.flush();
		driver.quit();
		ITestListener.super.onFinish(context);
	}

}
