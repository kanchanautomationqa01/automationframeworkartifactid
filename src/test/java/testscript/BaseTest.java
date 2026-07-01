package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobject.LoginPageObject;

public class BaseTest {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();

LoginPageObject lpo = new LoginPageObject(driver);
lpo.openLoginPage();
lpo.enterUnandPw("user@gmail.com","Admin@123");

	}

}
