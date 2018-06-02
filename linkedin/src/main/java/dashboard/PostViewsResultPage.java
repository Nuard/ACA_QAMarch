package dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class PostViewsResultPage extends PageObject {

	public PostViewsResultPage(WebDriver driver) {
		super(driver);
	}
	
public final static String PostViewsResultPageXpath = "//h1[@class='Sans-19px-black-85%-semibold']";
	
	@FindBy(xpath = PostViewsResultPageXpath)
	WebElement postviews;
	
}
