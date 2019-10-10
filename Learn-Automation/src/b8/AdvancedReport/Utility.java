package b8.AdvancedReport;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureimage(WebDriver driver, String name){
		
		try{
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String dest="F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 05\\Advanced Report\\"+name+".png";
			
			File destination=new File(dest);
			
			FileUtils.copyFile(source,destination);
			
			return dest;
		
		}catch(Exception e){
			
			return e.getMessage();
		}
		
		
	}

}
