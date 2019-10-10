package c2.AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleUpload {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("C:\\Users\\HP\\Desktop\\upload.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='1']")).click();	
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\DemoTask\\08072017\\multiple_1.exe"+" "+"C:\\Users\\HP\\Desktop\\iframe.html");

		Thread.sleep(3000);

		
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\HP\\Desktop\\DemoTask\\08072017\\multiple_1.exe"+" "+"C:\\Users\\HP\\Desktop\\Learn_Automation.docx");
	}

}
