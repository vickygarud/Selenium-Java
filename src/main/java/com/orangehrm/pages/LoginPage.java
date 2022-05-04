package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(id = "btnLogin")
	public WebElement loginButton;

	@FindBy(id = "welcome")
	public WebElement profile;

	@FindBy(partialLinkText = "Logout")
	public WebElement logout;

	@FindBy(id = "spanMessage")
	public WebElement loginErrorMessage;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * To login orangeHrm web page
	 * 
	 * @param username
	 * @param password
	 */

	public void login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		loginButton.click();
	}

	/**
	 * To logout 
	 */
	public void LogOut() {
		profile.click();
		logout.click();
	}

	/**
	 * Return Login Error message
	 * 
	 * @return
	 */
	public String getLoginErrorMessage() {
		return loginErrorMessage.getText();
	}

	/**
	 * Return OrangeHrm login page title
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

}
