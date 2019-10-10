package c4.TestNGListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener  implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case is fail and "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is Skipped and "+result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is Start and "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is Success and "+result.getName());
	}

}
