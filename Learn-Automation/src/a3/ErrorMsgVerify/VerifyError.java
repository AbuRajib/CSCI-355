package a3.ErrorMsgVerify;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyError {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String expected_value="Google";
		
		System.out.println("Start Test");
		
		String actual_value=driver.getTitle();
		
		Assert.assertEquals(actual_value, expected_value);
		
		System.out.println("Pass The Test");
		
		driver.quit();
	}

}
