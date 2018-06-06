package util;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class FunctionalTestBase {
	

		public WebDriver driver;
		final String URL = "https://www.linkedin.com/";
//		final String username = "fortesting14@yandex.ru";
//		final String pass = "Knockknock14";

	    @BeforeClass
	    @Parameters(value={"driver.prop", "driver.path", "login","pass"} )
	    public void setup(String chromeDriverProp, String driverPath, String username, String password)  {
	        System.setProperty(chromeDriverProp , driverPath);
	        System.setProperty(username, password);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	        driver.get(URL);
	        driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys(username);
	        driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@id='login-submit']")).click();
	    }
  	    
		@AfterClass
		public void tearDown() {
			driver.quit();
		}

}