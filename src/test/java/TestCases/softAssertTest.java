package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TastBase;
import Pages.LoginPage;
import Utility.captureScreenshot;

public class softAssertTest {

	public class LoginPageTest extends TastBase {

		LoginPage login;
		@BeforeMethod  
		public void setup() throws Exception 
		{
			initalization ();
		    login = new LoginPage();
		}
	
		
		@Test (enabled =false, dependsOnMethods = "verifyTitleTest",priority = 2,timeOut = 20000)
		public void verifyloginLogoTest()
		{
			 boolean result = login.verifyloginLogo();
			 Assert.assertEquals(result, true);
			 System.out.println("verifyloginLogoTest");
		}
		
//		@Test (enabled =false, dependsOnMethods ="verifyTitleTest",priority = 2)
		@Test (enabled =true, priority = 2)
		public void verifybotLogoTest()
		{
			SoftAssert s = new SoftAssert(); // we have to create object for soft assert
			boolean result = login.verifybotLogo();
		//	Assert.assertEquals(result, false);	
			System.out.println("Excution Started");
		//	System.out.println("verifybotLogoTest");
			s.assertEquals(result, false);
			System.out.println("Excution Ended");
			s.assertAll();
		}
	
		@Test (enabled =false,priority = 4)
		public void loginToAppTest() throws Exception
		{
			String lable = login.loginToApp1();
			Assert.assertEquals(lable, "PRODUCTS");        //PRODUCTS1 for ss we hv to do
			System.out.println("loginToAppTest");
		//	Assert.assertEquals(lable, ReadData.readExcelFile(1, 2));
		}
		
	
		@AfterMethod  
		public void closeBroser(ITestResult it) throws Exception 
		{
			if(ITestResult.FAILURE == it.getStatus());
			{
				captureScreenshot.screenshot(it.getName());
			}
			
			driver.quit();
		}
		
	}

}
