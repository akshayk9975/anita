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

public class LoginPageTest extends TastBase {

	LoginPage login;
	
	//It is	prerequisite to	run	the	test case open the	browser	+ enter	URL
	//This	will execute multiple times	depend	on	number of	test cases
	@BeforeMethod  
	public void setup() throws Exception
	{ 
		initalization ();
	    login = new LoginPage();
	}
	
	@Test  (enabled = true, priority = 2,invocationCount = 1)
	public void verifyTitleTest()  
	{
		String title = login.verifyTitle();
		Assert.assertEquals(title, "Swag Labs");
		System.out.println("verifyTitleTest");
	//	Assert.assertEquals(title, ReadData.readExcelFile(1, 0));
	}
	
	@Test (enabled =true, dependsOnMethods = "verifyTitleTest",priority = 2,timeOut = 20000)
	public void verifyloginLogoTest()
	{
		 boolean result = login.verifyloginLogo();
		 Assert.assertEquals(result, true);
		 System.out.println("verifyloginLogoTest");
	}
	
//	@Test (enabled =false, dependsOnMethods ="verifyTitleTest",priority = 2)
	@Test (enabled =true, priority = 1)
	public void verifybotLogoTest()
	{
		boolean result = login.verifybotLogo();
		Assert.assertEquals(result, true);
		System.out.println("verifybotLogoTest");
	}
	
	@Test (enabled =true,priority = 0)
	public void verifyurlTest() throws Exception
	{
		String url = login.verifyUrl();
		Assert.assertEquals(url,ReadData.readExcelFile(1, 1));
		System.out.println("verifyurlTest");
	}
	
	@Test (enabled =false,priority = 4)
	public void loginToAppTest() throws Exception
	{
		String lable = login.loginToApp1();
		Assert.assertEquals(lable, "PRODUCTS");        //PRODUCTS1 for ss we hv to do
		System.out.println("loginToAppTest");
	//	Assert.assertEquals(lable, ReadData.readExcelFile(1, 2));
	}
	
	@Test (enabled =false,priority = 5)
	public void loginToApp2Test() throws Exception
		{
			Assert.assertEquals(login.loginApp2(),ReadData.readExcelFile(1, 3));
			System.out.println("loginToApp2Test");
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
