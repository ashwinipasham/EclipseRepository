import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_FullWebpage_Screenshot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\apasham\\OneDrive\\Documents\\Ashu Stuff\\Eclipse\\Exceutables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		System.out.println("Before Search - Passed");
		
		driver.findElement(By.name("q")).sendKeys("Airbnb Ocean shores");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
		System.out.println("Input box found after search - Passed");
		
		driver.getTitle(); 
		
		System.out.println("Title found - Passed");
		
		
	}

}
