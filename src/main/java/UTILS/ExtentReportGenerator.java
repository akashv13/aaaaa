package UTILS;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


    //ExtentSparkreporter--UI OF REPORT (ALLIGNMENT, COLOUR, UI)
	//ExtentReport--(COMMON INFO --TESTCASE NAME, OPERATING SYSTEM NAME, MODULE NAME, ENVORNMNET NAME, BROWSER NAME, ETC)
	//ExtentTest--(UPDATING STATUS OF test RESULT IN REPORT)


public class ExtentReportGenerator implements ITestListener {


	
	
	public static ExtentSparkReporter sparkreport;
	public static ExtentReports reports;
	public static ExtentTest test;
	
    public void onStart(ITestContext context) {
    	String reportPath="C:\\Users\\Akash\\eclipse-workspace\\test4\\SDET24\\Reports\\index.html";
    	
    	
    	sparkreport=new ExtentSparkReporter(reportPath);
    	sparkreport.config().setDocumentTitle("SDET24 Automation Practice");
    	sparkreport.config().setReportName("Opencart Report");
    	sparkreport.config().setTheme(Theme.DARK);
    	
    	reports=new ExtentReports();
    	reports.attachReporter(sparkreport);
    	reports.setSystemInfo("Tester","Akash Valiv");
    	reports.setSystemInfo("Enviornment","QA");
    	reports.setSystemInfo("Browser","Chrome");
    	reports.setSystemInfo("Module","Signup");
	}

	

	public void onTestSuccess(ITestResult result) {
		test=reports.createTest(result.getName());
		test.log(Status.PASS, "Test Passes "+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		test=reports.createTest(result.getName());
		test.log(Status.FAIL,"Test Failed: "+ result.getName() );
		test.log(Status.FAIL,"Test Failed: "+ result.getThrowable() );
	}

	public void onTestSkipped(ITestResult result) {
		test=reports.createTest(result.getName());
		test.log(Status.SKIP,"Test Skipped: "+ result.getName() );
	}

	public void onFinish(ITestContext context) {
        reports.flush();

	
	
	
	
	
	}	

}
