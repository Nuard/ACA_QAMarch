package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class SignOut extends PageObject {
	public SignOut (WebDriver driver) {
		super (driver);
	}

	
 @FindBy(xpath="//button[@type='button' and contains(@id, '__dropdown-trigger')]")
 WebElement dropdownmenu;
 @FindBy(xpath="//a[@href='/m/logout/']")
 WebElement signoutbutton;
	
	 public void signOut() {
		 dropdownmenu.click();
		 signoutbutton.click();
	 }
}
