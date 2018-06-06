package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavJobsIconResults;
import util.FunctionalTestBase;

public class NavIconJobsTest extends FunctionalTestBase {
	
	@Test
	public void naviconjobsTest () {
		
		NavBarResults navbarresults = new NavBarResults (driver);
		NavJobsIconResults navjobsiconresults = navbarresults.clickJobs ();
		Assert.assertTrue(navjobsiconresults.isElementPresent(NavJobsIconResults.JobsIconXpath));
	}
}
