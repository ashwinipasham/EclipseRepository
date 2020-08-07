package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	@BeforeSuite
	public void setUp() {
		System.out.println("Initialize the test");
	}
	
	@AfterSuite
	public void tearDown() {
		System.out.println("Quitting the test");
	}
	
}
