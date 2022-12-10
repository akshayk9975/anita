package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TastBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;

public class cartTest extends TastBase {

	CartPage cart;
	LoginPage login;
	InventoryPage invent;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login = new  LoginPage();
	    invent = new InventoryPage();
		cart = new CartPage();
	}
	
	@Test 
	public void verifyurlCartTest() throws Exception  
	{
		login.loginToApp1();
		invent.cartBtn();
		String result = cart.Verifyurlcart();
		Assert.assertEquals(result, "https://www.saucedemo.com/cart.html");
	}
	
	@Test
	public void remove3Test() throws Exception
	{
		login.loginToApp1();
		//invent.cartBtn();
		invent.add6Product();
		String result = cart.remove3();
		Assert.assertEquals(result, "5");
	}
	
	@Test
	public void checkoutBtnTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
	}
	
	@AfterMethod
	public void closeb()
	{
		driver.quit();
	}
	
	
}
