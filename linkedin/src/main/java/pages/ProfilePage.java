package pages;

import org.openqa.selenium.WebDriver;

import basePages.PageObject;

public class ProfilePage extends PageObject {
	public ProfilePage (WebDriver driver) {
		super (driver);
	}
	
	public static final String ProfilePageXpath =  "//h2[@class='pv-dashboard-section__title']";

}
