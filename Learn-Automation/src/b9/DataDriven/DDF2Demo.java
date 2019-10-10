package b9.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF2Demo
{
	WebDriver driver;
	
	@Test
	public void LoginWordPress(){
	
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).sendKeys("");
		
		driver.findElement(By.xpath("")).click();
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		driver.quit();
	}
	
	@DataProvider(name="wordPressDemo")
	
	public Object[][] passData(){
		
		Utility excel=new Utility("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\Data Driven FF\\DDF.xlsx");
		
		int row=excel.sheetNumber(0);
		
		Object[][] data=new Object[row][2];
		
		for(int i=0;i<row;i++){
			
			data[i][0]=excel.getData(0, i, 0);
			data[i][1]=excel.getData(0, i, 1);
		}
		
		return data;
	}
}
