package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageobject.LoginPageObject;

public class BaseTest extends ReusableTestComponent {
@Test
	public void tc01()
	{
		
	launchAndLogin();
		
	}

}
