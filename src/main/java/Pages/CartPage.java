package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TastBase;

public class CartPage extends TastBase {

	//obj repo
//	@FindBy(xpath = "//div[@class='app_logo']") private WebElement smallLogocart;
//	@FindBy(xpath = "//img[@class=\"footer_robot\"]") private WebElement bigLogocart;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartPdt;
	@FindBy(xpath = "//button[@name='remove-sauce-labs-fleece-jacket']") private WebElement remove3;
	@FindBy(xpath = "//button[@class=\"btn btn_action btn_medium checkout_button\"]") private WebElement checkoutBtn;
	
	
	//constructor
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public String Verifyurlcart()
	{
		return driver.getCurrentUrl();
	}
	
	public String remove3()
	{
		remove3.click();
		String count = cartPdt.getText();
		return count;
	}
	
	public void checkoutBtn()
	{
		checkoutBtn.click();
	}
	
}
