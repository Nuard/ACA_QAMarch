package linkedin;

import edit.EditIntroWindow;
import edit.EditPhotoWindow;
import edit.EditProfilePage;
import messagingbox.ComposeMessageWindow;
import messagingbox.MessagingWindow;
import navbar.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FeedPage;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class LinkedInTest extends FunctionalTestBase {
	
 final String username = "fortesting14@yandex.ru";
 final String pass = "Knockknock14";
	
	@Test
	public void loginPageTest() {

	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	
	FeedPage feedpage = linkedinhomepage.loginData(username, pass);
	Assert.assertTrue(linkedinhomepage.isElementPresent(FeedPage.FeedPageXpath));
	
	EditProfilePage editprofilepage = feedpage.clickDropdownMenu();
	Assert.assertTrue(editprofilepage.isElementPresent(EditProfilePage.EditProfilePageXpath));
	
	EditPhotoWindow editphotowindow = editprofilepage.profilePhoto();
	Assert.assertTrue(editphotowindow.isElementPresent(EditPhotoWindow.EditPhotoXpath));
	

	EditIntroWindow editintrowindow = editphotowindow.applyClick();
	Assert.assertTrue(editintrowindow.isElementPresent(EditIntroWindow.EditIntroWindowXpath));

	editprofilepage = editintrowindow.saveeditIntro();
	
	}

	@Test
	public void navBarTest() {

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
	
	@Test
	public void messagingWindowTest() {
		
	MessagingWindow messagingwindow = new MessagingWindow (driver);
	
	ComposeMessageWindow composemessagew =  messagingwindow.composeIcon();
	Assert.assertTrue(composemessagew.isElementPresent(ComposeMessageWindow.ComposeWindowXPath));
	
	}
}