package dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class PostViews extends PageObject {

	public PostViews(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//a[@href='/in/for-test-286a04161/recent-activity/']")
	WebElement postviews;
	
	public PostViewsResultPage showpostViews() {
		postviews.click();
		return new PostViewsResultPage(driver);
	}

}
