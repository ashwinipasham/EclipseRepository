package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	@BeforeTest
	public void createDB() {
		System.out.println("Connecting to Database");
	}
	
	@AfterTest
	public void closeDB() {
		System.out.println("Closing Database");
	}
	
	@BeforeMethod
	public void Launchbrowser() {
		System.out.println("Launching browser");
	}

	@Test(priority = -1)
	public void doUserRegister() {
		System.out.println("Executing User Register method");
		//Assert.fail("User was not registered");
	}
	
	@Test(dependsOnMethods="doUserRegister")
	public void doLogin() {
	
		System.out.println("Executing Login method");
	}
	
	@Test(dependsOnMethods= "doUserRegister", alwaysRun=true)
	public void thirdTest() {
		System.out.println("Third Test");
	}
	
	
	public void fourthTest() {
		System.out.println("Fourth Test");
	}
	
	@AfterMethod
	public void Closebrowser() {
		System.out.println("Closing browser");
	}
	
}
