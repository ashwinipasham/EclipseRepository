package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver; 
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.rediff.com");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//alert method
		Alert alert  = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		System.out.println("Alert accepted");
		
	}

}
