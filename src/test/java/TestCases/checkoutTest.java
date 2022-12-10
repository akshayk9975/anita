package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TastBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.checkoutInfo;

public class checkoutTest extends TastBase{

	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	checkoutInfo check1;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		invent = new InventoryPage();
		cart = new CartPage();
		check1 = new checkoutInfo();
	}
	
	@Test
	public void verifyPageTitleTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		String result = check1.verifyPageTitle();
		Assert.assertEquals(result,"CHECKOUT: YOUR INFORMATION" );
	}
	
	@Test
	public void VerifyInfoTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		String result = check1.VerifyInfo();
		Assert.assertEquals(result, "CHECKOUT: OVERVIEW");
	}


	
	@AfterMethod
	public void closeMethod()
	{
		driver.quit();
	}
	
	
	
}
