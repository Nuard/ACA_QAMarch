package searchpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class SearchInput extends PageObject {

	public SearchInput (WebDriver driver) {
		super (driver);
	}
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchinput;
	@FindBy(xpath= "//div[@id='nav-search-controls-wormhole']")
	WebElement inspectbutton;
	
	public InspectButtonResults searchJob() {
		searchinput.sendKeys("teacher");;
		inspectbutton.click();
		return new InspectButtonResults(driver);
	}
}
