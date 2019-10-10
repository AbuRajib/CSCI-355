package c6.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Factory_Browser
{
	static WebDriver driver;
	
	public static WebDriver browser_select(String browser, String url){
		
		if(browser.equalsIgnoreCase("firefox")){
			
			driver=new FirefoxDriver();
		}
		
		if(browser.equalsIgnoreCase("chrome")){
			
			driver=new ChromeDriver();
		}
		
		if(browser.equalsIgnoreCase("ie")){
			
			driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		return driver;
	}
}
