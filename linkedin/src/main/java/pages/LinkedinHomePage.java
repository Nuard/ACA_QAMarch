package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class LinkedinHomePage extends PageObject{
	
 public LinkedinHomePage (WebDriver driver) {
	 super(driver);
 
 }
 
 public static final String LoginPageXpath = "//div[@class='core-rail']";
 @FindBy(xpath=LoginPageXpath)
 WebElement loginpagelogo;
 
 

}
