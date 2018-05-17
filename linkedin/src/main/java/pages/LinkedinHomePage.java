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
 
 @FindBy(xpath="//input[@id='login-email']")
 WebElement email;
 @FindBy(xpath="//input[@id='login-password']")
 WebElement password;
 @FindBy(xpath="//input[@id='login-submit']")
 WebElement submit;
 
 
 public FeedPage loginData(String username, String pass){
	 email.sendKeys(username);
	 password.sendKeys(pass);
	 submit.click();
	return new FeedPage (driver);
 }
 
}
