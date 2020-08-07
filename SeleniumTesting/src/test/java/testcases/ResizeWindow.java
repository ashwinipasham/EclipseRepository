package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		WebElement windowSize = (WebElement) driver.manage().window().getSize();
		
		System.out.println("Window size:" + windowSize);
		
				
		  int height = windowSize.getSize().height/2;
		  int width = windowSize.getSize().width/2;
		  
		  Actions action = new Actions(driver); 
		  action.dragAndDropBy(windowSize, height, width).perform();
		  
		  System.out.println("Height and width " + height+ ", " + width);
		
	}

}
