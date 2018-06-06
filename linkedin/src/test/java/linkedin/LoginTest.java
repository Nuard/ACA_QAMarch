package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LinkedinHomePage;
import pages.SignOut;
import util.FunctionalTestBase;

public class LoginTest extends FunctionalTestBase {
	
	@Test
	public void loginPageTest() {

	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);

	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
	
	SignOut signout = new SignOut (driver);
	signout.signOut();
	
	}
}
	
	
