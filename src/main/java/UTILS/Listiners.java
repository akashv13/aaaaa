package UTILS;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listiners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Testcase start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase failed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase skipped");
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finished ");
	}

}
