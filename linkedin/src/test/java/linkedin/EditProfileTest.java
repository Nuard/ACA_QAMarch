package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import edit.EditIntroWindow;
import edit.EditPhotoWindow;
import edit.EditProfilePage;
import pages.FeedPage;
import pages.LinkedinHomePage;
import pages.ProfilePage;
import util.FunctionalTestBase;

public class EditProfileTest extends FunctionalTestBase {
	 
	final String username = "fortesting14@yandex.ru";
	final String pass = "Knockknock14";

	@Test
	public void editProfile( ) {
				
		FeedPage feedpage = new FeedPage (driver);
	
		EditProfilePage editprofilepage = feedpage.clickDropdownMenu();
		Assert.assertTrue(editprofilepage.isElementPresent(EditProfilePage.EditProfilePageXpath));
	
		EditPhotoWindow editphotowindow = editprofilepage.profilePhoto();
		Assert.assertTrue(editphotowindow.isElementPresent(EditPhotoWindow.EditPhotoXpath));
	
		EditIntroWindow editintrowindow = editphotowindow.applyClick();
		Assert.assertTrue(editintrowindow.isElementPresent(EditIntroWindow.EditIntroWindowXpath));
		
		editintrowindow.saveeditIntro();
	
	}
}
