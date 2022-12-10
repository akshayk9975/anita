package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TastBase;
import Utility.ReadData;

public class LoginPage extends TastBase{

	//TC1	- Verify	application	title
	//TC2	- Verify	application	URL
	//TC3	- Verify	visibility	of	login	logo
	//TC4	- Verify	visibility	bot	logo
	//TC5	- Login	to	application
	//TC6	- Verify	the	URL	of	second	page	(inventory	page)
	
	//object Repository
	@FindBy(xpath = "//div[@class='login_logo']") private WebElement loginLogo;
	@FindBy(xpath = "//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath = "//input[@id='user-name']") private WebElement usernameBox;
	@FindBy(xpath = "//input[@id='password']") private WebElement passwardBox;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement loginBtn;
	
	@FindBy(xpath = "//span[@class='title']") private WebElement productLable;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String loginToApp1() throws Exception
	{
		usernameBox.sendKeys(ReadData.readPropertyFile("username"));
		passwardBox.sendKeys(ReadData.readPropertyFile("passward"));
		loginBtn.click();
		return productLable.getText();
	}
	public String loginApp2() throws Exception
	{
		loginToApp1();
		return driver.getCurrentUrl();
	}
	
	public boolean verifyloginLogo()
	{
		return loginLogo.isDisplayed();
	}
	
	public boolean verifybotLogo()
	{
		return botLogo.isDisplayed();
	}
	
	//method verify the title
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	
	//method to verify the url
	public String verifyUrl()
	{
		return driver.getCurrentUrl();
	}
		
}
