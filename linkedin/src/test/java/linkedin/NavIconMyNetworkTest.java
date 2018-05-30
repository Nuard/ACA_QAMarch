package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavHomeIconRestults;
import navbar.NavMyNetworkIconResults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavIconMyNetworkTest extends FunctionalTestBase {
	
	@Test
	public void mynetworkTest() {
		
		LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
		linkedinhomepage.loginData(getUsername(), getPass());
		Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
		
		NavBarResults navbarresults = new NavBarResults (driver);
		
		NavMyNetworkIconResults navmynetworkresults = navbarresults.clickMynetwork();
		Assert.assertTrue(navmynetworkresults.isElementPresent(NavMyNetworkIconResults.MyNetworkPageXpath));
		
	}
}
