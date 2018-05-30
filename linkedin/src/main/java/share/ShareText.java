package share;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class ShareText extends PageObject{

	public ShareText(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//button[@class='Sans-17px-black-70%']")
	WebElement inputtexteditor;
	@FindBy(xpath="//div[@class='mentions-texteditor__contenteditable Sans-15px-black-70%']")
	WebElement texteditor;
	@FindBy(xpath="//div[@class='mentions-texteditor__contenteditable Sans-15px-black-70%']")
	WebElement mentionscontent;
	@FindBy(xpath="//button[@class='button-primary-medium sharing-subaction-bar__post-button sharing-share-box__post-button  post ember-view']")
	WebElement postbutton;
	
	public void sharePost() {
		inputtexteditor.click();
		texteditor.click();
		mentionscontent.sendKeys("Hello");
		postbutton.click();
	}

}
