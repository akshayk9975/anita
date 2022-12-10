package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.TastBase;
import Pages.InventoryPage;
import Pages.LoginPage;
import Utility.ReadData;

public class InventoryPageTest extends TastBase {

		LoginPage login;
		InventoryPage invent;
		@BeforeMethod
		public void setup() throws Exception
		{
			initalization();
			invent = new InventoryPage();
			login = new LoginPage(); 
		}
		

		@Test (enabled = false)
		public void verifysmallLogo() throws Exception
		{
			login.loginToApp1();
			boolean result = invent.verifySmallLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test (enabled = false)
		public void verifybigLogo() throws Exception
		{
			login.loginToApp1();
			boolean result = invent.verifyBigLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test 
		public void add6Product() throws Exception
		{
			login.loginToApp1();
			String count = invent.add6Product();
		//	Assert.assertEquals(count, "6");
			Assert.assertEquals(count, ReadData.readExcelFile(1, 4));
		}
		
		@Test (enabled = false)
		public void verifytwiterLogoTest() throws Exception
		{
			login.loginToApp1();
			boolean result = invent.verifytwiterLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test (enabled = false)
		public void verifyfbLogoTest() throws Exception
		{
			login.loginToApp1();
			boolean result = invent.verifyfbLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test (enabled = false)
		public void verifylinkedInTest() throws Exception
		{
			login.loginToApp1();
			boolean result = invent.verifylinkedLogo();
			Assert.assertEquals(result, true);
		}
		
		@Test (enabled = false )
		public void cartBtnTest() throws Exception
		{
			login.loginToApp1();
		    String result = invent.cartBtn();
		    Assert.assertEquals(result, "YOUR CART");
		}
		
		@Test (enabled = false)
		public void remove2ProductTest() throws Exception
		{
			login.loginToApp1();
			invent.add6Product();
			String result = invent.remove2Product();
			Assert.assertEquals(result, "4");
		}
		
		@AfterMethod
		public void closeBroser()
		{
			driver.quit();
		}
		
}
