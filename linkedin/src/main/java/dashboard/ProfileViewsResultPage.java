package dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class ProfileViewsResultPage extends PageObject {

	public ProfileViewsResultPage(WebDriver driver) {
		super(driver);
	}
	
	public final static String ProfileViewsResultPageXpath = "//h1[@class='Sans-21px-black-85%']";
	
	@FindBy(xpath = ProfileViewsResultPageXpath)
	WebElement profileviews;

}
