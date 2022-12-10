package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TastBase;

public class completePage extends TastBase{

	//Obj Repo
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement burgerBtn;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logout;
	
	
	//constructor
	public completePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void burgerBtnV()
	{
		burgerBtn.click();
	}
	
	public void logoutC()
	{
		logout.click();
	}
	
	
	
}
