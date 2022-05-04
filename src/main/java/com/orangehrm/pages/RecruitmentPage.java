package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BaseClass;

public class RecruitmentPage extends BaseClass {

	@FindBy(id = "addCandidate_firstName")
	WebElement firstName;

	@FindBy(id = "addCandidate_lastName")
	WebElement lastName;

	@FindBy(id = "addCandidate_email")
	WebElement email;

	public RecruitmentPage() {	
		PageFactory.initElements(driver, this);
	}

}
