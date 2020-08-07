package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class BaseTest {
    WebDriver driver;
	String baseUrl1;
	String baseUrl2;

	@BeforeTest
	public void setUp() throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		baseUrl1 = ("https://www.google.com/");
		baseUrl2 = ("https://www.mozilla.org/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test(priority =1)
	public void testChromeBrowser() throws InterruptedException {
		driver.get(baseUrl1);
	}
	
	
	 @Test(priority = 2)
	 public void testFirefoxbrowser() throws InterruptedException {
	 driver.get(baseUrl2); }
	 
	 
	  @Test(priority =3)
	  public void testIEbrowser() throws InterruptedException { String
	  baseUrl3 = "https://www.msn.com/"; 
	  driver.get(baseUrl3); }
	 
	
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
