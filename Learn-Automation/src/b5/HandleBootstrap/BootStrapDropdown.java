package b5.HandleBootstrap;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
		List<WebElement> list=driver.findElements(By.xpath(".//*[@class='dropdown-menu']/li/a"));
		
		int listOfsize=list.size();
		
		System.out.println("The Number of Size: "+listOfsize);
		
		
		for(int i=0;i<listOfsize;i++){
			
			WebElement element=list.get(i);
			
			String value=element.getAttribute("innerHTML");
			
			if(value.equalsIgnoreCase("CSS")){
				
				element.click();
				
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
