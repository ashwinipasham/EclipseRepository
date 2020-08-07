package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {

	@Test
	public void validateTitles() {
				
		System.out.println("Beginning");
		String expected_title = "Yahoo.com" ; //excel
		String actual_title = "Gmail.com"; //selenium
	
		SoftAssert softassert = new SoftAssert();
		
		System.out.println("Validating titles");
		/*
		 * if ((expected_title == actual_title)) {
		 * System.out.println("Test case passed");
		 * 
		 * }else { System.out.println("Test case failed"); }
		 */
		softassert.assertEquals(actual_title, expected_title);
		//Assert.assertTrue(true, "element not found");
		softassert.fail("Failing the test as condition is not met");
		softassert.assertEquals(true, false, "text box not found");
		System.out.println("ENding");
		
		softassert.assertAll();
	}
	
}
