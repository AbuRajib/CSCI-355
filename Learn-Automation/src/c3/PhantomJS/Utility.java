package c3.PhantomJS;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility
{
	public static String captureScreenshot(WebDriver driver,String name){
		
		try{
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String dest="";
			
			File destination=new File(dest);
			
			FileUtils.copyFile(source, destination);
			
			return dest;
			
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
			return e.getMessage();
		}
		
	}
}
