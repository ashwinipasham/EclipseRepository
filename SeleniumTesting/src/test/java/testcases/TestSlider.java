package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
				
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println(frames.size());
		
		for(WebElement frame: frames) {
			
			System.out.println(frame.getAttribute("id"));
		}
		
		
		driver.switchTo().frame(0);
		System.out.println("Switched to frame");
		WebElement mainSlider = driver.findElement(By.id("slider"));
		int width = mainSlider.getSize().width/2;
		
		WebElement slider = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/span[1]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(slider, width, 0).perform();
		
		
		
		
	}

}
