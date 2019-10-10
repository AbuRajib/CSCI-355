package c3.PhantomJS;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJs 
{
	
	@Test
	public void facebookTitle(){
		
		File src=new File("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 06\\PhantonJS\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		WebDriver driver=new PhantomJSDriver();
		
		driver.get("");
		
		System.out.println(driver.getTitle());
		
		Utility.captureScreenshot(driver,"phantomjsExample");
		
	}
}
