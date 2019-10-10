package b2.HandleHiddenElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HiddenElement
{
	@Test
	public void element(){

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> element=driver.findElements(By.id("male"));
		
		int numberOfsize=element.size();
		
		System.out.println("The number of sizes: "+numberOfsize);
	
		
		for(int i=0;i<=numberOfsize;i++){
			
			WebElement ele=element.get(i);
			
			int x=ele.getLocation().getX();
			
			if(x!=0){
				
				ele.click();
				
				break;
			}
		}
		
		driver.quit();
	}
}
