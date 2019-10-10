package c6.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NormalApproach
{

	@Test
	public void loginVerify(){
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		Normal_Utility login=new Normal_Utility(driver);
		
		login.userName("");
		login.passWord("");
		login.clickButton();
		
		driver.quit();
	}
}
