package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavNotificationsIconResults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavIconNotificationsTest extends FunctionalTestBase {
	
	@Test
	public void naviconnotificationsTest () {
		LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
		linkedinhomepage.loginData(getUsername(), getPass());
		Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
		
		NavBarResults navbarresults = new NavBarResults (driver);
		
		NavNotificationsIconResults navnotificationciconresults = navbarresults.clickNotifications();
		Assert.assertTrue(navnotificationciconresults.isElementPresent(NavNotificationsIconResults.NotificationsPageXpath));
	}

}
