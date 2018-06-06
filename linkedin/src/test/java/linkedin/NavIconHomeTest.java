package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import navbar.NavBarResults;
import navbar.NavHomeIconRestults;
import util.FunctionalTestBase;

public class NavIconHomeTest extends FunctionalTestBase {
	
	@Test
	public void homeiconTest() {
				
		NavBarResults navbarresults = new NavBarResults (driver);	
		NavHomeIconRestults navhomeiconresults = navbarresults.clickHome();
		Assert.assertTrue(navhomeiconresults.isElementPresent(NavHomeIconRestults.FeedPageXpath));
		
	}
}
