package c4.TestNGListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(c4.TestNGListener.TestngListener.class)

public class MyFirstTestCase 
{
	@Test ()
	public void testDemo(){
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
