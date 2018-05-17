package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LinkedinHomePage;
import searchpages.InspectButtonResults;
import searchpages.JobsResultPage;
import searchpages.SearchInput;
import util.FunctionalTestBase;

public class SearchTest extends FunctionalTestBase {
	
	@Test
	public void searchInput() {
		
	LinkedinHomePage linkedinhomepage = new LinkedinHomePage(driver);
	linkedinhomepage.loginData(getUsername(), getPass());
	Assert.assertTrue(linkedinhomepage.isElementPresent(LinkedinHomePage.LoginPageXpath));
	
	SearchInput searchinput = new SearchInput(driver);
	InspectButtonResults inspectbuttonresults = searchinput.searchJob();
	
	JobsResultPage jobsresultpage = inspectbuttonresults.displayJobs();
	
	}
}
