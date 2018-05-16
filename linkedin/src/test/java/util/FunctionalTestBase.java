package util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class FunctionalTestBase {
	

		public WebDriver driver;
		final String URL = "https://www.linkedin.com/";

	    @BeforeClass
	    @Parameters(value={"driver.prop", "driver.path"} )
	    public void setup(String chromeDriverProp, String driverPath)  {
	        System.setProperty(chromeDriverProp , driverPath);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	        driver.get(URL);
	    }
	    
		@AfterClass
		public void tearDown() {
			driver.quit();
		}


}