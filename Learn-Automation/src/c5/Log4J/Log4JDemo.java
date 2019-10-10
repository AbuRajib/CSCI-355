package c5.Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4JDemo {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("LogDemo");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver=new FirefoxDriver();
		logger.info("Launch the Browser");
		
		driver.get("");
		logger.info("Navigate to URL");
		
		driver.manage().window().maximize();
		logger.info("Maximize the broswer");
		
		driver.getTitle();
		logger.info("Get title of the page");
		
		driver.quit();
	}

}
