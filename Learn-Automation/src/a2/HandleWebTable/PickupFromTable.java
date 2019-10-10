package a2.HandleWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PickupFromTable {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("datepicker")).click();
		
		
		List<WebElement> value=driver.findElements(By.tagName("td"));
		
		for(WebElement st:value){
			
			if(st.getText().equalsIgnoreCase("12")){
				
				driver.findElement(By.linkText("12")).click();
				
				break;
			}
			
		}
		
		driver.quit();
	}

}
