package b3.UntrustedDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class UntrustedCertificate 
{

	@Test
	
	public void HandleUntrusted(){
		
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.cacert.org/");
		
		driver.manage().window().maximize();
		
	}
}
