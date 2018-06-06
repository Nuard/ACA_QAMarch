package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavNotificationsIconResults;
import util.FunctionalTestBase;

public class NavIconNotificationsTest extends FunctionalTestBase {
	
	@Test
	public void naviconnotificationsTest () {

		NavBarResults navbarresults = new NavBarResults (driver);
		NavNotificationsIconResults navnotificationciconresults = navbarresults.clickNotifications();
		Assert.assertTrue(navnotificationciconresults.isElementPresent(NavNotificationsIconResults.NotificationsPageXpath));
	}
}
