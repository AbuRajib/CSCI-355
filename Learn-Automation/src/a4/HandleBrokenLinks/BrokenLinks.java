package a4.HandleBrokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		
		System.out.println("The number of lists: "+list.size());
		
		for(int i=0;i<list.size();i++){
			
			WebElement element=list.get(i);
			
			String st=element.getAttribute("href");
			
			verifyLink(st);
		}
		
		driver.quit();
		
	}
	

	public static void verifyLink( String link){
		
		try{
		URL url=new URL(link);
		
		HttpURLConnection httpUrl=(HttpURLConnection)url.openConnection();
		
		httpUrl.setConnectTimeout(30000);
		
		httpUrl.connect();
		
		if(httpUrl.getResponseCode()==200){
			
			System.out.println(link+" "+httpUrl.getResponseMessage());
		}else if(httpUrl.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
			
			System.out.println(link+" "+httpUrl.getResponseMessage());
		}
		
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		
	}
}



