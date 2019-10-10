package a8.ScreenshotFailedTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FailedTestCase
{
	WebDriver driver;
	
	@Test
	public void test(){
		
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("abc")).sendKeys("Selenium");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			
			Utility.captureScreenshot(driver, result.getName());
		}
		
		driver.quit();
	}
}
