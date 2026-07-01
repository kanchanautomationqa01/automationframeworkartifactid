package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableComponents.AbstractComponents;

public class LoginPageObject extends AbstractComponents {
WebDriver driver;	
	
public LoginPageObject(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="username") WebElement email;
@FindBy(id="password") WebElement pass;
@FindBy(id="Login") WebElement lgbtn;
	
	
	
	
	public void openLoginPage()
	{
		
		driver.get("https://login.salesforce.com/?locale=in");
		max();
	}
	
	public void enterUnandPw(String un, String pw) 
	{
		email.sendKeys(un);
	
		pass.sendKeys(pw);
		
		lgbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
