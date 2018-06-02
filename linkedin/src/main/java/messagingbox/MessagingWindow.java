package messagingbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class MessagingWindow extends PageObject {
	public MessagingWindow (WebDriver driver) {
		super (driver);
	}
	
	public static final String MessagBoxXpath = "//div[@id=\"ember2929\"]"; 
	
	@FindBy (xpath="//button[@class='msg-overlay-bubble-header__control msg-overlay-bubble-header__control--new-convo-btn']")
	WebElement composemsg;

	public  ComposeMessageWindow composeIcon () {
		composemsg.click();
		return new ComposeMessageWindow (driver);
	}
}
