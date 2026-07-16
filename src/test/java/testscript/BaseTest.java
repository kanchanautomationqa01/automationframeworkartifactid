package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;
import utility.ScreenshotUtility;

public class BaseTest extends ReusableTestComponent {
	@Test(dataProvider="getExcelData")
	public void tc01(String username , String password) throws IOException 
	{
		
	launchAndLogin(username,password);
	ScreenshotUtility su = new ScreenshotUtility(driver);	
	su.takeScreenshot(driver);
	}

    
        @DataProvider
		public Object[][] getExcelData() throws IOException 
		{
		String filepath = "C:\\Users\\hp\\OneDrive\\Desktop\\automation\\mycsv.xlsx";
		String sheetname = "mysheet";	
			 return ExcelUtility.readExcelData(filepath, sheetname);
			
} 
    
    
    
    
}
