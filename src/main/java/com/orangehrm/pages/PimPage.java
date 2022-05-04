package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class PimPage extends BaseClass {
	
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimmodule;
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement empList;

	public PimPage() {
		PageFactory.initElements(driver, this);
	}

}
