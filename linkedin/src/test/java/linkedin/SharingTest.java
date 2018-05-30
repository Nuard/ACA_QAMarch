package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LinkedinHomePage;
import share.ShareText;
import util.FunctionalTestBase;

public class SharingTest extends FunctionalTestBase {
	
	@Test
	public void shareTest() {

	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	linkedinhomepage.loginData(getUsername(), getPass());
	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
	
	ShareText sharetext = new ShareText(driver);
	sharetext.sharePost();
	
	}

}
