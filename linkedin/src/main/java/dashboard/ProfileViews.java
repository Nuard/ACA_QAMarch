package dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class ProfileViews extends PageObject {

	public ProfileViews(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/me/profile-views/']")
	WebElement profviews;
	
	public ProfileViewsResultPage showViews() {
		profviews.click();
		return new ProfileViewsResultPage(driver);
	}

}
