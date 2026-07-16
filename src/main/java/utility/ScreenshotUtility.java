package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	WebDriver driver;
	
	
	
	
	public ScreenshotUtility(WebDriver driver) {
		this.driver = driver;
	}




	public void takeScreenshot(WebDriver driver) throws IOException
	
	{
		TakesScreenshot tc = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File source = tc.getScreenshotAs(OutputType.FILE) ;
		File destination = new File ("C:\\Users\\hp\\OneDrive\\Desktop\\automation\\" + timestamp+ ".png");
		FileUtils.copyFile(source, destination);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
