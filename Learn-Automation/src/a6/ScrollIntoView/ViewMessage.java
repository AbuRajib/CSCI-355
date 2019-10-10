package a6.ScrollIntoView;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ViewMessage{

	public static void main(String[] args)  throws Exception {

		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement element=driver.findElement(By.xpath(".//*[@id='mCSB_2_container']/p[3]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		System.out.println(element.getText());
		
		Thread.sleep(1000);
		
		driver.quit();
		
	}

}
