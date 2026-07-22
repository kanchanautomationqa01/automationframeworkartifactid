package bddCucumberStepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
WebDriver driver;
	@Given("I have landed on login page")
	public void i_have_landed_on_login_page()
	{
	 driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/?locale=in");		
	}
	
	@When("I enter {string} in username field")
	public void i_enter_username(String username)
	{
	driver.findElement(By.id("username")).sendKeys(username);	
	}
	
	@And("I enter {string} in password field")
	public void i_enter_password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@Then("click on log in button")
	public void click_on_log_in_button()
	{
		driver.findElement(By.id("Login")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
