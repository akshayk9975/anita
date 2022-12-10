package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TastBase;

public class checkoutInfo extends TastBase{

	//obj Repo
	@FindBy(xpath = "//input[@placeholder='First Name']") private WebElement firstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']") private WebElement lastName;
	@FindBy(xpath = "//input[@placeholder='Zip/Postal Code']")private WebElement postCode;
	@FindBy(xpath = "//span[text()='Checkout: Your Information']") private WebElement checkoutInfoTitle;
	
	@FindBy(xpath = "//input[@class='submit-button btn btn_primary cart_button btn_action']") private WebElement continueBtn;
	@FindBy(xpath = "//span[text()='Checkout: Overview']") private WebElement checkoutPageTitle;
	
	//Constructor
    public checkoutInfo()
    {
    	PageFactory.initElements(driver, this);
    }

	//Method
    
    public String verifyPageTitle()
    {
    	return checkoutInfoTitle.getText();
    }
    
    public String VerifyInfo() 
    {
    	firstName.sendKeys("Akshay");
    	lastName.sendKeys("k");
    	postCode.sendKeys("123");
    	continueBtn.click();
    	return checkoutPageTitle.getText();
    }

	}


