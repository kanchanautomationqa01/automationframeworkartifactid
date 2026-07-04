package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.LoginPageObject;

public class ReusableTestComponent {
	WebDriver driver;
	public WebDriver initializeDriver()
	{
		String browsername=  "chrome";
		if(browsername.equalsIgnoreCase("chrome")) 
		{
			 driver = new ChromeDriver();
			
		}
			
		return driver;
	}
	
	public void launchAndLogin()
	{
		
	driver = initializeDriver();
	LoginPageObject lpo = new LoginPageObject(driver);
	lpo.openLoginPage();
	lpo.enterUnandPw("hello", "admin@12");
	
		
	}
	
	
	
	
	
	
	
	

}
