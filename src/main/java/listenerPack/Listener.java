package listenerPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import extentpack.ExtentManager;

public class Listener implements ITestListener {
private 	static ExtentReports extent;
private static ExtentTest test;	
	
	
	public void onStart(ITestContext context)
	{
	extent=ExtentManager.getExtentReport();
		
		
	}
	public void onTestStart(ITestResult result)
	{
		
	test = extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
    test.log(Status.PASS, "Test case successfully passed");
	}
	
	public void onTestFailure(ITestResult result)
	{
		test.log(Status.FAIL,"Test case failed");
	} 
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	


