package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;
import navbar.NavBarResults;
import navbar.NavMessagingIconResults;
import util.FunctionalTestBase;

public class NavIconMessagingTest extends FunctionalTestBase {
	
	@Test
	public void naviconMessagingTest () {

		NavBarResults navbarresults = new NavBarResults (driver);
		NavMessagingIconResults navmessagingiconresults = navbarresults.clickMessaging();
		Assert.assertTrue(navmessagingiconresults.isElementPresent(NavMessagingIconResults.MessagingPageXpath));

	}
}
