package b9.DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDF1demo {

	WebDriver driver;
	
	@Test (dataProvider="WordpressDemo")
	public void LoginWordPress(String username,String passWord){
		
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("")).sendKeys(username);
		
		driver.findElement(By.xpath("")).sendKeys(passWord);
		
		driver.findElement(By.xpath("")).click();
		
		Assert.assertTrue(driver.getTitle().contains(""));
	}
	
	
	@AfterMethod
	public void tearDown(){
		
		
	}

	@DataProvider(name="WordpressDemo")
	
	public Object[][] passData(){
		
		Object[][] data=new Object[3][2]; 
		
		data[0][0]="";
		data[0][1]="";
		
		data[1][0]="";
		data[1][1]="";
		
		data[2][0]="";
		data[2][1]="";
		
		return data;
		
	}

}

