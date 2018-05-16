package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;
import edit.EditProfilePage;

public class FeedPage extends PageObject {
   
	public FeedPage (WebDriver driver) {
		
		super(driver);
	}
	
	public static final String FeedPageXpath = "//div[@class='sharing-create-share-view__wrapper art-deco-container-card']";
	
	@FindBy(xpath="//button[@type='button' and contains(@id, '__dropdown-trigger')]")
	WebElement dropdownmenu;
	@FindBy(xpath="//h3[@class='nav-settings__member-name Sans-16px-black-90%-bold']")
	WebElement profilepagebutton;
	
	public EditProfilePage clickDropdownMenu() {
		dropdownmenu.click();
		profilepagebutton.click();
		return new EditProfilePage (driver);
	}
}
