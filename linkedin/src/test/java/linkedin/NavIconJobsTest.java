package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavJobsIconResults;
import pages.LinkedinHomePage;
import util.FunctionalTestBase;

public class NavIconJobsTest extends FunctionalTestBase {
	
	@Test
	public void naviconjobsTest () {
		
		LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
		linkedinhomepage.loginData(getUsername(), getPass());
		Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
		
		NavBarResults navbarresults = new NavBarResults (driver);
		
		NavJobsIconResults navjobsiconresults = navbarresults.clickJobs ();
		Assert.assertTrue(navjobsiconresults.isElementPresent(NavJobsIconResults.JobsIconXpath));
	}

}
