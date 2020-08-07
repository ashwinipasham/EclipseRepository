package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("gNO89b"))).click();
		
		driver.findElement(By.className("ellip")).click();
		WebElement menu = driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/header[1]/div[3]/div[1]/nav[1]/div[2]/ul[1]/li[7]/a[1]"));
		
		Actions action = new Actions(driver);		
		action.moveToElement(menu).perform();
		
		driver.findElement(By.linkText("Practice site 1")).click();
		System.out.println("Mouse hovered to Practice Site1");
		
		
		
		
	}

}
