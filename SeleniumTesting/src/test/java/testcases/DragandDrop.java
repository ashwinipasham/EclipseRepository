package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
		WebElement droppable = driver.findElement(By.cssSelector("#droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).perform();
		System.out.println("Dropped to target location");
		
	}

}
