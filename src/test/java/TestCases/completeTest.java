package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import Base.TastBase;
import Pages.CartPage;
import Pages.InventoryPage;
import Pages.LoginPage;
import Pages.checkOutPage2;
import Pages.checkoutInfo;
import Pages.completePage;

public class completeTest extends TastBase{

	LoginPage login ;
	InventoryPage invent;
	CartPage cart;
	checkoutInfo check1;
	checkOutPage2 check2 ;
	completePage comp;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login = new LoginPage();
		invent = new InventoryPage();
	    cart = new CartPage();
		check1 = new checkoutInfo();
	    check2 = new checkOutPage2();
		comp = new completePage();
	}
	
	
	
	@Test
	public void burgerBtnVTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		comp.burgerBtnV();
	}
	
	@Test
	public void logoutTest() throws Exception
	{
		login.loginToApp1();
		invent.cartBtn();
		cart.checkoutBtn();
		check1.VerifyInfo();
		comp.burgerBtnV();
		comp.logoutC();
	}
	
	
	
	@AfterMethod
	public void closebr()
	{
		driver.close();
	}
}
