package b1.HighLightsElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightElement
{

	public static void element(WebDriver driver, WebElement element){
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background-color:black;color:white')", element);
		
		try{
			
			Thread.sleep(1000);
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
		}
		
		
		js.executeScript("arguments[0].setAttribute('style','background-color:red;color:white')", element);
		
	}

}
