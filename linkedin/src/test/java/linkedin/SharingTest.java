package linkedin;

import org.testng.annotations.Test;
import share.ShareText;
import util.FunctionalTestBase;

public class SharingTest extends FunctionalTestBase {
	
	@Test
	public void shareTest() {
	
		ShareText sharetext = new ShareText(driver);
		sharetext.sharePost();
	}
}
