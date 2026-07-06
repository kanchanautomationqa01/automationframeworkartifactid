package listenerPack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("Hello i am started");
	
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println(" Hello i run successfully");
	
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Hello i failed");
		System.out.println(result.getMethod().getMethodName());
	    System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	


