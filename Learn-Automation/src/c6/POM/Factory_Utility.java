package c6.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Factory_Utility 
{	
	WebDriver driver;
	
	public Factory_Utility(WebDriver driver){
		
		this.driver=driver;
	}
		
	@FindBy(id="")
	WebElement username;
	
	@FindBy(how=How.ID, using="")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="")
	WebElement clickButton;
	
	public void loginPage(String name,String pass){
		
		username.sendKeys(name);
		password.sendKeys(pass);
		clickButton.click();
	}
	
}
