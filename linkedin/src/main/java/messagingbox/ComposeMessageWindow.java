package messagingbox;

import org.openqa.selenium.WebDriver;

import basePages.PageObject;

public class ComposeMessageWindow extends PageObject {
	public ComposeMessageWindow(WebDriver driver) {
		super (driver);
	}
	
	public static final String ComposeWindowXPath="//div[@id='msg-overlay-conversation-bubble-4020']";

	
	
}
