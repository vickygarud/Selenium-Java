package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class EmployeeListPage extends BaseClass {

	@FindBy(id = "btnAdd")
	public WebElement addButton;

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastName;

	@FindBy(id = "btnSave")
	public WebElement saveButton;

	
	
	public EmployeeListPage() {
		PageFactory.initElements(driver, this);
	}

}
