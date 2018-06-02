package messagingbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;
import navbar.NavNotificationsIconResults;

public class ComposeMessageWindow extends PageObject {
	public ComposeMessageWindow(WebDriver driver) {
		super (driver);
	}
	
	public static final String ComposeWindowXPath="//section[@class='msg-overlay-bubble-header__details pv1 align-items-flex-start flex-column']";
	
	@FindBy(xpath="//button[@class='msg-overlay-bubble-header__control js-msg-close']")
	WebElement closeicon;

	public void closeMessaging() {
		closeicon.click();
	}
}
	
	

	
	

