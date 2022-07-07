package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;

public class PropertyHandling {

	Properties property;

	public PropertyHandling() throws IOException {

		FileInputStream inputFile = new FileInputStream("C:\\java\\OrangeHrmAutomationProject\\config.properties");
		property = new Properties();
		property.load(inputFile);
		inputFile.close();

//		FileOutputStream output = new FileOutputStream("C:\\java\\OrangeHrmAutomationProject\\config.properties",true);
//		property.setProperty("browser", "edge");
//		property.store(output, "Comment");
	}

	public String getProperty(String key) {
		return property.getProperty(key);
	}

	public void setBrowserCapabilities() {
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(false);
		options.addArguments("start-maximized"); // to maximize
		options.addExtensions(new File("C:\\Selenium\\extension_4_3_5_0.crx"));
		// options.addArguments("");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");

		options.setExperimentalOption("prefs", prefs);

	}
}
