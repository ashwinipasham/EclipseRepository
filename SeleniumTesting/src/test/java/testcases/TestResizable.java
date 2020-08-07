package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestResizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		//driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		//driver.switchTo().defaultContent(); ---switches to default Content
		//driver.switchTo().parentFrame(); --- switches to parent frame
		WebElement resizable = driver.findElement(By.id("resizable"));
		System.out.println("Resizable element: " + resizable.isDisplayed());
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 200, 200).perform();
		System.out.println("Resized the frame");
	}

}
