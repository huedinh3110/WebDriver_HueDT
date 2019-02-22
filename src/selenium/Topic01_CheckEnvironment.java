package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic01_CheckEnvironment {
	WebDriver driver;
	  @BeforeClass
	  public void beforeClass() {
		  driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://live.guru99.com/");
	  }

	  @Test
	  public void TC01_checkURL() {
		  String currentURL=driver.getCurrentUrl();
		  Assert.assertEquals("http://live.guru99.com/", currentURL);
	  }
	  
	  @Test
	  public void TC02_checkTitle() {
		  String currentTitle=driver.getTitle();
		  Assert.assertEquals("Home page", currentTitle);
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }

}
