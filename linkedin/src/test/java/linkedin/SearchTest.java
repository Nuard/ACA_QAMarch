package linkedin;

import org.testng.annotations.Test;
import searchpages.InspectButtonResults;
import searchpages.SearchInput;
import util.FunctionalTestBase;

public class SearchTest extends FunctionalTestBase {
	
	@Test
	public void searchInput() {
		
		SearchInput searchinput = new SearchInput(driver);	
		InspectButtonResults inspectbuttonresults = searchinput.searchJob();
		inspectbuttonresults.displayJobs();
	
	}
}
