package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavMyNetworkIconResults;
import util.FunctionalTestBase;

public class NavIconMyNetworkTest extends FunctionalTestBase {
	
	@Test
	public void mynetworkTest() {
			
		NavBarResults navbarresults = new NavBarResults (driver);
		NavMyNetworkIconResults navmynetworkresults = navbarresults.clickMynetwork();
		Assert.assertTrue(navmynetworkresults.isElementPresent(NavMyNetworkIconResults.MyNetworkPageXpath));
		
	}
}
