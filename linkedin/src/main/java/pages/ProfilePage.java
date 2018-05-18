package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class ProfilePage extends PageObject {
	public ProfilePage (WebDriver driver) {
		super (driver);
	}
	
	public static final String ProfilePageXpath =  "//h2[@class='pv-dashboard-section__title']";
	
	
	@FindBy(xpath="//button[@type='button' and contains(@id, '__dropdown-trigger')]")
	WebElement dropdownmenu;
	@FindBy(xpath="//h3[@class='nav-settings__member-name Sans-16px-black-90%-bold']")
	WebElement profilepagebutton;
	
	public void navigatetoProfilePage() {
		dropdownmenu.click();
		profilepagebutton.click();
	}

}
