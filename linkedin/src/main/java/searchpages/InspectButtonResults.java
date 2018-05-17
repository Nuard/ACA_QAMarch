package searchpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InspectButtonResults extends SearchInput {

	public InspectButtonResults(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//li/button[@data-vertical='JOBS']")
	WebElement jobs;
	
	public JobsResultPage displayJobs() {
		jobs.click();
		return new JobsResultPage(driver);
	}

}
