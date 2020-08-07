

import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Airbnb_Seattle_Screenshot {
  private WebDriver driver;
  String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	  System.setProperty("webdriver.gecko.driver",
			  "C:\\Users\\apasham\\OneDrive\\Documents\\Ashu Stuff\\Eclipse\\Exceutables\\geckodriver.exe");
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testAirbnbSeattle() throws Exception {
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).clear();
    driver.findElement(By.name("q")).sendKeys("airbnb seattle");
    driver.findElement(By.name("btnK")).click();
    driver.findElement(By.linkText("Downtown Seattle Vacation ...")).click();
    driver.findElement(By.xpath("//a[contains(@href, '/s/downtown-seattle-wa/homes?property_type_id%5B%5D=57&property_type_id%5B%5D=8&property_type_id%5B%5D=32&property_type_id%5B%5D=58&property_type_id%5B%5D=5&property_type_id%5B%5D=18&property_type_id%5B%5D=17&property_type_id%5B%5D=23&property_type_id%5B%5D=63&property_type_id%5B%5D=64&property_type_id%5B%5D=24&property_type_id%5B%5D=12&property_type_id%5B%5D=19&property_type_id%5B%5D=10&property_type_id%5B%5D=34&property_type_id%5B%5D=67&property_type_id%5B%5D=25&property_type_id%5B%5D=6&property_type_id%5B%5D=15&place_id=ChIJLVcisbZqkFQRQx2ONFFfxkw&refinement_paths%5B%5D=%2Fhomes')]")).click();
   
    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
    driver.manage().window().maximize();
    Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
    try {
    	ImageIO.write(screenshot.getImage(), "PNG", newFile("C:\\temp\\Tools\\Katalon_Studio_Windows_64-7.4.0\\Screenshots"
    			+ "\\Fullscreen.png"));	
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    }
    
  }

  private ImageOutputStream newFile(String string) {
	// TODO Auto-generated method stub
	return null;
}

@AfterClass(alwaysRun = false)
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}

