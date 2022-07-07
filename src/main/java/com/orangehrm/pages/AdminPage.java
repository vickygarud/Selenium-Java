package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class AdminPage extends BaseClass {

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement adminModule;

	@FindBy(id = "menu_admin_UserManagement")
	public WebElement UserManagement;

	@FindBy(id = "menu_admin_viewSystemUsers")
	public WebElement users;

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

}
