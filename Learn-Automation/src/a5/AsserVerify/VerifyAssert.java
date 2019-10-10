package a5.AsserVerify;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class VerifyAssert {

	public static void main(String[] args) {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Start Soft Assert");
		
		soft.assertEquals(12, 13);
		
		System.out.println("End Soft Assert");
		
		
		
		System.out.println("Start Hard Assert");
		
		Assert.assertEquals(12, 13);
		
		System.out.println("End Hard Assert");
	}

}
