package com.orangehrm.pages;

import org.openqa.selenium.By;

import utils.BaseClass;

public class ForgotPasswordPage extends BaseClass {

	private By usernameTextBox = By.id("securityAuthentication_userName");
	private By resetButton = By.id("btnSearchValues");
	private By cancelButton = By.id("btnCancel");
	private By warningMessage = By.cssSelector("div.fadable");

	public void setUsername(String username) {
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public boolean isMessageWarningDisplayed() {
		return driver.findElement(warningMessage).isDisplayed();
	}

	public String getWarningMessage() {
		return driver.findElement(warningMessage).getText();
	}
}
