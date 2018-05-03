package navbar;

import org.openqa.selenium.WebDriver;

public class NavMessagingIconResults extends NavBarResults {
	public NavMessagingIconResults (WebDriver driver) {
		super(driver);
	}

	public static final String MessagingPageXpath = "//h1[@class='msg-conversations-container__title ph4 Sans-17px-black-85%-semibold']";
}
