package b1.HighLightsElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath(".//*[@id='email']"));
		
		HighlightElement.element(driver,userName);
		
		userName.sendKeys("Selenium");
		
		
		WebElement passWord=driver.findElement(By.xpath(".//*[@id='pass']"));
		
		HighlightElement.element(driver,passWord);
		
		passWord.sendKeys("WebDriver");
		
		driver.quit();
		
	}

}
