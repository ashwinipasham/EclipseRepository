package customListners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onStart(ITestResult result) {

	}

	public void onTestSucess(ITestResult result) {
		System.out.println("Passed Test - " + result.getTestName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Capturing screenshot");
	}
	public void onTestSkipped(ITestResult result) {

	}
	public void onFinish(ITestResult result) {

	}
}


