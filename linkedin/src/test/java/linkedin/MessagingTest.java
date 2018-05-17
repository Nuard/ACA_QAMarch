package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import messagingbox.ComposeMessageWindow;
import messagingbox.MessagingWindow;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class MessagingTest extends FunctionalTestBase {
	
	final String username = "fortesting14@yandex.ru";
	final String pass = "Knockknock14";

	@Test
	public void messagingWindowTest() {
	
	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	linkedinhomepage.loginData(username, pass);
	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
	
	MessagingWindow messagingwindow = new MessagingWindow (driver);
	
	ComposeMessageWindow composemessagew =  messagingwindow.composeIcon();
	Assert.assertTrue(composemessagew.isElementPresent(ComposeMessageWindow.ComposeWindowXPath));
	
	composemessagew.closeMessaging();
	
	}

}
