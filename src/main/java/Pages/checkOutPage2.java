package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TastBase;

public class checkOutPage2 extends TastBase{

	//obj Repo
	@FindBy(xpath = "//div[text()='Payment Information:']") private WebElement paymtInfo;
	@FindBy(xpath = "//div[text()='Shipping Information:']") private WebElement shippingInfo;
	@FindBy(xpath = "//div[@class='summary_subtotal_label']") private WebElement total;
	@FindBy(xpath = "//button[@class=\"btn btn_action btn_medium cart_button\"]") private WebElement finishBtn;
	@FindBy(xpath = "//span[text()='Checkout: Complete!']") private WebElement checkComplete;
//	@FindBy(xpath = "") private WebElement
	
	//constructor
	public checkOutPage2()
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public boolean verifyPaymentInfo()
	{
		return paymtInfo.isDisplayed();
	}
	
	public boolean verifyPayshippingInfo()
	{
		return shippingInfo.isDisplayed();
	}
	
	public boolean verifytotal()
	{
		return total.isDisplayed();
	}
	
	public String finishBtPage()
	{
		finishBtn.click();
		return checkComplete.getText();
	}
	
}
