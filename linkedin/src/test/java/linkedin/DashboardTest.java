package linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import dashboard.PostViews;
import dashboard.PostViewsResultPage;
import dashboard.ProfileViews;
import dashboard.ProfileViewsResultPage;
import pages.ProfilePage;
import util.FunctionalTestBase;

public class DashboardTest extends FunctionalTestBase {
	
	@Test
	public void dashboardTest () {
	
		ProfilePage profilepage = new ProfilePage (driver);
		profilepage.navigatetoProfilePage();
		
		ProfileViews profileviews = new ProfileViews(driver);
		ProfileViewsResultPage profileviewsResultPage = profileviews.showViews();
		Assert.assertTrue(profileviewsResultPage.isElementPresent(ProfileViewsResultPage.ProfileViewsResultPageXpath));
		
		profilepage.navigatetoProfilePage();
		PostViews postviews = new PostViews(driver);
		PostViewsResultPage postviewsresultpage = postviews.showpostViews();
		Assert.assertTrue(postviewsresultpage.isElementPresent(PostViewsResultPage.PostViewsResultPageXpath));
		
	}

}
