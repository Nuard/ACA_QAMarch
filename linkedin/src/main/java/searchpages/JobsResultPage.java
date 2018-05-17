package searchpages;

import org.openqa.selenium.WebDriver;

public class JobsResultPage extends SearchInput {

	public JobsResultPage(WebDriver driver) {
		super(driver);
	}
	
	public final static String JobsResultPageXpath="//h2[@class='search-s-rail__section-heading Sans-17px-black-85% mb4']";

}
