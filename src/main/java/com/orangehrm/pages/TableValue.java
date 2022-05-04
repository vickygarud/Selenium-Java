package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BaseClass;

public class TableValue extends BaseClass{
	
	@FindBy(xpath = "//table[@class='table hover']//th[@class='header']")
	public List<WebElement> totalColumn;

	@FindBy(xpath = "//table[@class='table hover']//preceding::tr")
	public List<WebElement> totalRows;

	@FindBy(xpath = "//table[@class='table hover']//preceding::tr/td[@class='left']")
	public List<WebElement> rowValue;
	

	public TableValue() {	
		PageFactory.initElements(driver, this);
	}

}
