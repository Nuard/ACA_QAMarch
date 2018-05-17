package edit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePages.PageObject;
import pages.ProfilePage;

public class EditProfilePage extends PageObject {
	
	public EditProfilePage (WebDriver driver) {
		super(driver);
	}
	
	public static final String EditProfilePageXpath = "//h2[@class='pv-dashboard-section__title']";
	
  @FindBy (xpath="//div/button[@class='profile-photo-edit__edit-btn']")
  WebElement editphoto;
  @FindBy (xpath="//button[@class='profile-photo-cropper__apply-action button-primary-medium ']")
  WebElement apply;
  @FindBy(xpath="//div/button[@class='pe-form-footer__action--submit form-submit-action Sans-15px-white-100%']")
  WebElement savebutton;

public EditPhotoWindow profilePhoto() {
	editphoto.click();
	return new EditPhotoWindow (driver);
}

public EditIntroWindow applyClick() {
	apply.click();
	return new EditIntroWindow (driver);
}

public ProfilePage saveeditIntro () {
	savebutton.submit();
	return new ProfilePage(driver);
}

}

