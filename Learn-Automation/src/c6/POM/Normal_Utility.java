package c6.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Normal_Utility 
{
	WebDriver driver;
	By username=By.xpath("");
	By password=By.xpath("");
	By login=By.xpath("");
	
	public Normal_Utility(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void userName(String name){
		
		driver.findElement(username).sendKeys(name);
	}
	
	public void passWord(String pass){
		
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickButton(){
		
		driver.findElement(login).click();
	}
}
