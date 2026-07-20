package extentpack;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
public static ExtentReports extent;
	
	
	public  static ExtentReports  getExtentReport()
	{
	
		if (extent==null) 
		{
			
			String reportPath = System.getProperty("user.dir")+"/reports/extent-report.html";
			
			File reportsFolder = new File(System.getProperty("user.dir")+"/reports");
			if(!reportsFolder.exists())
			{
				reportsFolder.mkdir();	

			}
			ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("Test Report");
			
			extent= new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("Tester", "Kanchan chauhan");
		}
		return extent;
	}
	
}
