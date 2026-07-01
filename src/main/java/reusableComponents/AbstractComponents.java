package reusableComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class AbstractComponents {
	WebDriver driver;
	public AbstractComponents(WebDriver driver) {
    this.driver = driver;

	}
	public void max() 
	{	
	  driver.manage().window().maximize();	
	}
	public void impwait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	
	

}
