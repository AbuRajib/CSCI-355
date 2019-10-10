package a9.HandleIFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IframeHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("file:///C:/Users/HP/Desktop/iframe.html");
		
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath(".//*[@id='global-nav-secondary']/div/ul/li[2]/a/span[2]")).click();;
		
		System.out.println("First Iframe Titile: "+driver.getTitle());
		
		driver.switchTo().defaultContent();
		
		
		
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath(".//*[@id='global-nav-secondary']/div/ul/li[3]/a/span[2]")).click();
		
		System.out.println("Second Iframe Title: "+driver.getTitle());
		
		driver.switchTo().defaultContent();
		
	}

}
