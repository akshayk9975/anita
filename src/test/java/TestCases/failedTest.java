package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TastBase;
import Pages.LoginPage;
import Utility.ReadData;
import Utility.captureScreenshot;

public class failedTest extends  TastBase{

	LoginPage login;
	
	@BeforeMethod  
	public void setup() throws Exception 
	{
		initalization ();
	    login = new LoginPage();
	}
	
	@Test  
	public void verifyTitleTest()  
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println("verifyTitleTest");
	//	Assert.assertEquals(title, ReadData.readExcelFile(1, 0));
	}
	
	@Test 
	public void verifyloginLogoTest()
	{
		 boolean result = login.verifyloginLogo();
		 Assert.assertEquals(result, true);
		 System.out.println("verifyloginLogoTest");
	}
	
		@Test 
	public void verifybotLogoTest()
	{
		boolean result = login.verifybotLogo();
		Assert.assertEquals(result, true);
		System.out.println("verifybotLogoTest");
	}
	
	@Test ()
	public void verifyurlTest() throws Exception
	{
		String url = login.verifyUrl();
		Assert.assertEquals(url, "https://www.saucedemo.com/");
		System.out.println("verifyurlTest");
	}
	
	@Test ()
	public void loginToAppTest() throws Exception
	{
		String lable = login.loginToApp1();
		Assert.assertEquals(lable, "PRODUCTS");        //PRODUCTS1 for ss we hv to do
		System.out.println("loginToAppTest");
	}
	
	@Test ()
	public void loginToApp2Test() throws Exception
		{
		    Assert.assertEquals(false, null);
			Assert.assertEquals(login.loginApp2(),ReadData.readExcelFile(1, 3));
			System.out.println("loginToApp2Test");
		}

	@AfterMethod  
	public void closeBroser()
	{
		driver.quit();
	}
	
}

