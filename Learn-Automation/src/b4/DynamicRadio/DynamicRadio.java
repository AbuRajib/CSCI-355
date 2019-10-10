package b4.DynamicRadio;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicRadio {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> element=driver.findElements(By.xpath(".//*[@type='radio' and @name='lang']"));
		
		int numberofsize=element.size();
		
		System.out.println("The number of size: "+numberofsize);
		
		for(int i=0;i<numberofsize;i++){
			
			WebElement ele=element.get(i);
			
			String value=ele.getAttribute("value");
			
			if(value.equalsIgnoreCase("java")){
				
				ele.click();
			}
		}
		
		driver.quit();
	}

}
