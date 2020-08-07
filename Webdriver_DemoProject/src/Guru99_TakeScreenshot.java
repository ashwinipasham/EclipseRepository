import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Guru99_TakeScreenshot {
	
	@Test
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver;
		 System.setProperty("webdriver.gecko.driver",
					  "C:\\Users\\apasham\\OneDrive\\Documents\\Ashu Stuff\\Eclipse\\Exceutables\\geckodriver.exe");
		    driver = new FirefoxDriver();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		    driver.get("http://demo.guru99.com/V4/");
		    
		    //Call take screenshot function
		    Guru99_TakeScreenshot.takeSnapShot(driver, "C:\\temp\\Tools\\Katalon_Studio_Windows_64-7.4.0\\Screenshots\\guruTest.png");
		    
		    System.out.println("Test Passed");
		    System.out.println("Screenshot Taken");
		  }

		public static void takeSnapShot(WebDriver driver, String fileWithPath) throws Exception{
			// TODO Auto-generated method stub
			
			TakesScreenshot scrShot = ((TakesScreenshot)driver); 
			
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			File DestFile = new File(fileWithPath); 
			
			FileUtils.copyFile(SrcFile, DestFile); 						
		}
	}
