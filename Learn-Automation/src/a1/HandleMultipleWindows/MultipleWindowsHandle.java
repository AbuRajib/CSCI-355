package a1.HandleMultipleWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/SignUp?continue=https%3A%2F%2Faccounts.google.com%2FManageAccount");
		
		driver.manage().window().maximize();
		
		String parent_page=driver.getWindowHandle();
		
		System.out.println("Parent Page Title:" +driver.getTitle());

		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[1]/a")).click(); 
		
	
		Set<String> st=driver.getWindowHandles();
		
		Iterator<String> it=st.iterator();
		
		while(it.hasNext()){
			
			String child_page=it.next();
			
			if(parent_page!=child_page){
				
				driver.switchTo().window(child_page);
				
				System.out.println("Child Page Title "+driver.getTitle());
				
				driver.close();
			}
		}
	
		driver.quit();
	}

}
