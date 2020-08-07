package TestCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void isSkip()
	{
		System.out.println("Skip Test");
		throw new SkipException("Skipping the test");
	}

}
