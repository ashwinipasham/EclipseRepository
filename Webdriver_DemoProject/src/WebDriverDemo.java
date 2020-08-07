import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\apasham\\OneDrive\\Documents\\Ashu Stuff\\Eclipse\\Exceutables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://www.guru99.com/");
		
			System.out.println("Test Passed");
		
			/*System.out.println("Test Failed");*/
	
	}

}
