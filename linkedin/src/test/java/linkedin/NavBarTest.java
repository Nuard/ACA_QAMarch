package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavHomeIconRestults;
import navbar.NavJobsIconResults;
import navbar.NavMessagingIconResults;
import navbar.NavMyNetworkIconResults;
import navbar.NavNotificationsIconResults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavBarTest extends FunctionalTestBase {
	
	final String username = "fortesting14@yandex.ru";
	final String pass = "Knockknock14";

	@Test
	public void navBarTest() {
		
	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	linkedinhomepage.loginData(username, pass);
	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
	
	NavBarResults navbarresults = new NavBarResults (driver);
		
	NavHomeIconRestults navhomeiconresults = navbarresults.clickHome();
	Assert.assertTrue(navhomeiconresults.isElementPresent(NavHomeIconRestults.FeedPageXpath));
			
	NavMyNetworkIconResults navmynetworkresults = navhomeiconresults.clickMynetwork();
	Assert.assertTrue(navmynetworkresults.isElementPresent(NavMyNetworkIconResults.MyNetworkPageXpath));
			
	NavJobsIconResults navjobsiconresults = navmynetworkresults.clickJobs ();
	Assert.assertTrue(navjobsiconresults.isElementPresent(NavJobsIconResults.JobsIconXpath));

	NavMessagingIconResults navmessagingiconresults = navjobsiconresults.clickMessaging();
	Assert.assertTrue(navmessagingiconresults.isElementPresent(NavMessagingIconResults.MessagingPageXpath));

	NavNotificationsIconResults navnotificationciconresults = navmessagingiconresults.clickNotifications();
	Assert.assertTrue(navnotificationciconresults.isElementPresent(NavNotificationsIconResults.NotificationsPageXpath));
						
	}
}
