package c1.Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo {

	public static void main(String[] args) throws Exception {
		
		
		Screen src=new Screen();
		
		Pattern image1=new Pattern("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 06\\Sikuli\\Images\\wordpress1.PNG");
		
		Pattern image2=new Pattern("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 06\\Sikuli\\Images\\wordpress2.PNG");
		
		Pattern image3=new Pattern("F:\\Selenium Video- Mukesh Otwani\\Mukesh-Otwani 06\\Sikuli\\Images\\wordpress3.PNG");
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("");
		
		driver.manage().window().maximize();
		
		
		src.type(image1,"username");
		
		src.type(image2,"password");
		
		src.click(image3);
	}

}
