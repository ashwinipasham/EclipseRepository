package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FillRegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WedDriverManager.chromedriver().setup();

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\apasham\\OneDrive\\Documents\\Ashu Stuff\\Eclipse\\Exceutables\\geckodriver.exe");

		// WebDriverManager.chromedriver().setup();
		WebDriver driver1 = new FirefoxDriver();

		driver1.get("http://qa.way2automation.com");
		driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		System.out.println("Launched the webiste");
		// fill the registration form country, city, name and submit
		WebElement Country = driver1.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(Country);
		select.selectByValue("Greenland");

		driver1.findElement(By.xpath("//input[@name='city']")).sendKeys("Hyderabad");
		driver1.findElement(By.xpath("//input[@name='name']")).sendKeys("Ashwini");

		System.out.println("Hyderbad is selected as City");

		WebElement SubmitButton = driver1.findElement(By.className("button"));
		System.out.println("SubmitButton is displayed: " + SubmitButton.isDisplayed());
		
		 //Hidden element which as same identifier and values
		SubmitButton = driver1.findElement(By.xpath(
		  "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]"
		  )); 
		SubmitButton.click();
		  System.out.println(SubmitButton);
		  
		//driver1.quit();
		 

	}

}
