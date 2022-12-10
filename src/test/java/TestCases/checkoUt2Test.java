  package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TastBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.checkOutPage2;
import Pages.checkoutInfo;

public class checkoUt2Test extends TastBase {

	 LoginPage	login;
	 InventoryPage invent;
	  CartPage cart;
	  checkoutInfo check1;
	  checkOutPage2 check2;
	
	@BeforeMethod
	public void setup() throws Exception
	{
	  initalization();
	  login =new LoginPage();
	  invent = new InventoryPage();
	  cart = new CartPage();
	  check1 = new checkoutInfo();
	  check2 = new checkOutPage2();
	}
	
	@Test
	public void verifyPaymentInfoTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		boolean result = check2.verifyPaymentInfo();
		Assert.assertEquals(result, true); 
	}
	
	@Test
	public void verifyPayshippingInfoTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		boolean result = check2.verifyPayshippingInfo();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void verifytotalTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		boolean result = check2.verifytotal();
		Assert.assertEquals(result, true);
	} 
	
	@Test
	public void finishBtPageTEst() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		String result = check2.finishBtPage();
		Assert.assertEquals(result, "CHECKOUT: COMPLETE!");
	}
	
	
	@AfterMethod
	public void closeB()
	{
		driver.close();
	}
}
