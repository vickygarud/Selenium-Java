package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class DashBoardPage extends BaseClass {

	@FindBy(id = "welcome")
	private WebElement welcomeText;
	private By leaveMenu = By.id("menu_leave_viewLeaveModule");
	private By applySubmenu = By.id("menu_leave_applyLeave");

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	public String getWelcomeText() {
		return welcomeText.getText();
	}

}
