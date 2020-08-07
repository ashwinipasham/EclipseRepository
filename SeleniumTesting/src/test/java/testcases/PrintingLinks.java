package testcases;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintingLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http:\\google.com");
		//driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"))
		.sendKeys("way2automation");
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement searchButton = driver.findElement(By.className("gNO89b"));
		 
		 WebDriverWait wait = new WebDriverWait (driver, 20);
		 wait.until(ExpectedConditions.visibilityOf(searchButton));
		 
		 searchButton.click();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 	 
		 WebElement firstLink = driver.findElement(By.className("ellip"));
		 
		 WebDriverWait wait1 = new WebDriverWait (driver, 50);
		 wait1.until(ExpectedConditions.visibilityOf(firstLink));
		 
		 firstLink.click();
		 
		 
		 
		 System.out.println("Search title found, sended keys and first link got clicked");
		 
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("------Printing Links-----");
		 System.out.println("Total Links:" + links.size());
		 
		 for(WebElement link : links) {
			 System.out.println(link.getText() + "-----URL------" + link.getAttribute("href"));
		 }
		
}
}
