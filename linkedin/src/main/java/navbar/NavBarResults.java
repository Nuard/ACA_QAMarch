package navbar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;

public class NavBarResults extends PageObject {
	
	public NavBarResults (WebDriver driver) {
		super(driver);
	}
	
	public static final String navBarXpath="//nav[@id='extended-nav']";
	@FindBy(xpath=navBarXpath)
	WebElement navbar;
	
	@FindBy(xpath="//li/a[@href='/feed/']")
	WebElement homeicon;
	
	@FindBy(xpath="//li/a[@href='/mynetwork/']")
	WebElement mynetworkicon;
	
	@FindBy(xpath="//li/a[@href='/jobs/']")
	WebElement jobsicon;
	
	@FindBy(xpath="//li/a[@href='/messaging/']")
	WebElement messaging;
	
	@FindBy(xpath="//li/a[@href='/notifications/']")
	WebElement notifications;
	
	public NavHomeIconRestults clickHome() {
		homeicon.click();
		return new NavHomeIconRestults(driver);
	}
	
	public NavMyNetworkIconResults clickMynetwork() {
		mynetworkicon.click();
		return new NavMyNetworkIconResults (driver);
	}
	
	public NavJobsIconResults clickJobs () {
		jobsicon.click();
		return new NavJobsIconResults (driver);
	}
	
	public NavMessagingIconResults clickMessaging () {
		messaging.click();
		return new NavMessagingIconResults (driver);
	}
	
	public NavNotificationsIconResults clickNotifications () {
		notifications.click();
		return new NavNotificationsIconResults (driver);
	}
}
