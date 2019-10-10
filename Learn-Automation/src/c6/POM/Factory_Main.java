package c6.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Factory_Main {

	@Test
	public void checkValidUser() {
		
		WebDriver driver=Factory_Browser.browser_select("firefox","");
		
		Factory_Utility login_page=PageFactory.initElements(driver, Factory_Utility.class);
		
		login_page.loginPage("", "");
	}

}
