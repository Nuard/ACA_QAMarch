package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FunctionalTestBase {
	

		public WebDriver driver;
		final String URL = "https://www.linkedin.com/";

	    @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }
	    
	    @BeforeClass
	    public void setupTest() {
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