package b8.AdvancedReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class VerifyPageTitle 
{
	WebDriver driver;
	
	ExtentReports report;
	
	ExtentTest logger;
	
	@Test
	public void pageTitle(){
		
		report=new ExtentReports("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\Advanced Report\\10102018.html");
		
		logger=report.startTest("Start The Test");
		
		logger.log(LogStatus.INFO, "Launch The Browser");
		driver=new FirefoxDriver();
		
		logger.log(LogStatus.INFO, "Maximize The Browser");
		driver.manage().window().maximize();
		
		logger.log(LogStatus.INFO, "Navigate to The URL");
		driver.get("");
		
		logger.log(LogStatus.INFO,"Get Title drom browser");
		String title=driver.getTitle();
		
		logger.log(LogStatus.PASS, "Pass the Test Case");
		Assert.assertTrue(title.contains("Google"));
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){
			
			String image=Utility.captureimage(driver, result.getName());
			
			String element=logger.addScreenCapture(image);
			
			logger.log(LogStatus.FAIL, "Fail the Test Case",element);
		}
		
		report.endTest(logger);
		
		report.flush();
	}
	
	
	
	
}
