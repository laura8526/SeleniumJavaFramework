package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
          System.out.println("Test Started:  " +result.getName());
	}

	public void onTestSucess(ITestResult result) {
		System.out.println("Test Sucessful:  " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed:  " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped:  " +result.getName());
	}
	public void onFinish(ITestResult result) {
		System.out.println("Test Completed:  " +result.getName());
	}
}