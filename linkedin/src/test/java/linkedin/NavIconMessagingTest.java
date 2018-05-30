package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavMessagingIconResults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavIconMessagingTest extends FunctionalTestBase {
	
	@Test
	public void naviconMessagingTest () {
		LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
		linkedinhomepage.loginData(getUsername(), getPass());
		Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
		
		NavBarResults navbarresults = new NavBarResults (driver);
		
		NavMessagingIconResults navmessagingiconresults = navbarresults.clickMessaging();
		Assert.assertTrue(navmessagingiconresults.isElementPresent(NavMessagingIconResults.MessagingPageXpath));

	}

}
