package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import messagingbox.ComposeMessageWindow;
import messagingbox.MessagingWindow;
import util.FunctionalTestBase;

public class MessagingTest extends FunctionalTestBase {
	
	@Test
	public void messagingWindowTest() {
	
		MessagingWindow messagingwindow = new MessagingWindow (driver);
	
		ComposeMessageWindow composemessagew =  messagingwindow.composeIcon();
		Assert.assertTrue(composemessagew.isElementPresent(ComposeMessageWindow.ComposeWindowXPath));
	
		composemessagew.closeMessaging();
	
	}

}
