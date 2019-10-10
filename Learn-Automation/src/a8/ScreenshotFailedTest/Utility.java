package a8.ScreenshotFailedTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility 
{
	
	public static String captureScreenshot(WebDriver driver, String name){
		
		try{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String dest="C:\\Users\\HP\\workspace\\Learn-Automation\\src\\a8\\ScreenshotFailedTest\\"+name+".png";
		
		File destination=new File(dest);
		
		FileUtils.copyFile(source,destination);
				
		System.out.println("Takes Screenshot");
		
		return dest;
		
		}catch(Exception e){
			
			System.out.println(e.getMessage());
			
			return e.getMessage();
			
		}
	}
}
