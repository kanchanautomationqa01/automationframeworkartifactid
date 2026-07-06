package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;

public class BaseTest extends ReusableTestComponent {
@Test
	public void tc01()
	{
		
	launchAndLogin();
		
	}

    @Test
    public void tc02()
    {
	String actualerror = "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator";
	String expectederror = "Error: Please check your credentials. If you still can't log in, contact your Salesforce administrator.";
	Assert.assertEquals(actualerror, expectederror);
    }

}
