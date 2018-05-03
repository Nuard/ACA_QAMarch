package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import edit.EditIntroWindow;
import edit.EditPhotoWindow;
import edit.EditProfilePage;
import navbar.NavHomeIconRestults;
import navbar.NavJobsIconResults;
import navbar.NavMessagingIconResults;
import navbar.NavMyNetworkIconResults;
import navbar.NavNotificationsIconResults;
import pages.FeedPage;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class LinkedInTest extends FunctionalTestBase {
	
	final String username = "fortesting14@yandex.ru";
	final String pass = "Knockknock14";
	
	@Test
	public void loginPageTest() throws InterruptedException {

	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	linkedinhomepage.loginData(username, pass);
	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.FeedPageXpath));
	
	FeedPage feedpage = new FeedPage (driver);
	Assert.assertTrue(feedpage.isElementPresent(FeedPage.FeedPageXpath));
	feedpage.clickDropdownMenu();
	
	EditProfilePage editprofilepage = new EditProfilePage (driver);
	Assert.assertTrue(editprofilepage.isElementPresent(EditProfilePage.EditProfilePageXpath));
	editprofilepage.profilePhoto();
	
	
	EditPhotoWindow editphotowindow = new EditPhotoWindow (driver);
	Assert.assertTrue(editphotowindow.isElementPresent(EditPhotoWindow.EditPhotoXpath));
	editphotowindow.applyClick();
	
	
	EditIntroWindow editintrowindow = new EditIntroWindow (driver);
	Assert.assertTrue(editintrowindow.isElementPresent(EditIntroWindow.EditIntroWindowXpath));
	editintrowindow.saveeditIntro();
	
	NavHomeIconRestults navhomeiconresults = new NavHomeIconRestults (driver);
	navhomeiconresults.clickHome();
	Assert.assertTrue(navhomeiconresults.isElementPresent(NavHomeIconRestults.FeedPageXpath));
	
	NavMyNetworkIconResults namynetworkresults = new NavMyNetworkIconResults (driver);
	namynetworkresults.clickMynetwork();
	Assert.assertTrue(namynetworkresults.isElementPresent(NavMyNetworkIconResults.MyNetworkPageXpath));
	
	NavJobsIconResults navjobsiconresults = new NavJobsIconResults(driver);
	navjobsiconresults.clickJobs ();
	Assert.assertTrue(navjobsiconresults.isElementPresent(NavJobsIconResults.JobsIconXpath));
	
	NavMessagingIconResults navmessagingiconresults = new NavMessagingIconResults (driver);
	navmessagingiconresults.clickMessaging();
	Assert.assertTrue(navmessagingiconresults.isElementPresent(NavMessagingIconResults.MessagingPageXpath));
	
	NavNotificationsIconResults navnotificationciconresults = new NavNotificationsIconResults (driver);
	navnotificationciconresults.clickNotifications();
	Assert.assertTrue(navnotificationciconresults.isElementPresent(NavNotificationsIconResults.NotificationsPageXpath));
	

	
	Thread.sleep(3000);
	
	}	
}