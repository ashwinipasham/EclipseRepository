package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3 extends BaseTest {
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

	@Test(priority = -1, groups= {"smoke"})
	public void doUserRegister() {
		System.out.println("Executing User Register method");
		//Assert.fail("User was not registered");
	}
	
	@Test(dependsOnMethods="doUserRegister", groups= {"function", "smoke"})
	public void doLogin() {
		System.out.println("Executing Login method");
	}
	
	@Test(dependsOnMethods= "doUserRegister", alwaysRun=true)
	public void thirdTest() {
		System.out.println("Third Test");
	}
	
	@Test(groups="bvt")
	public void fourthTest() {
		System.out.println("Fourth Test");
	}
	
	
}
