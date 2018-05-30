package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavHomeIconRestults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavIconHomeTest extends FunctionalTestBase {
	
	@Test
	public void homeiconTest() {
		
		LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
		linkedinhomepage.loginData(getUsername(), getPass());
		Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
		
		NavBarResults navbarresults = new NavBarResults (driver);
		
		NavHomeIconRestults navhomeiconresults = navbarresults.clickHome();
		Assert.assertTrue(navhomeiconresults.isElementPresent(NavHomeIconRestults.FeedPageXpath));
	}

}
