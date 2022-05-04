package DropDown;

import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	
	public static void main(String[] args) {
		
		Select dropdown = new Select(null);
		
		dropdown.selectByVisibleText(null);
		dropdown.selectByValue(null);
		dropdown.selectByIndex(0);
		
	}
	

}
