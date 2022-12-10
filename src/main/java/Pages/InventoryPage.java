package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.TastBase;
import Utility.ReadData;
import Utility.utilityMethod;

public class InventoryPage extends TastBase{

//tc1 Small Logo
//tc2 Big logo
//tc3 Add 6 Product
//tc4 Remove 2 Product
//tc5 Twiter
//tc6 FB
//tc7 LinkedIn
	
	//Object Repo
	@FindBy(xpath = "//div[@class='peek']") private WebElement smallLogo;
	@FindBy(xpath = "//img[@class='footer_robot']") private WebElement bigLogo;
	@FindBy(xpath = "//select[@class='product_sort_container']") private WebElement sortedDropdown;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-backpack']") private WebElement bagpackProduct;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bike-light']") private WebElement bikeLightProduct;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']") private WebElement blackTshit;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-fleece-jacket']") private WebElement jacketProduct;
	@FindBy(xpath = "//button[@name='add-to-cart-sauce-labs-onesie']") private WebElement labERedProduct;
	@FindBy(xpath = "//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement redTshirtP;
	@FindBy(xpath = "//a[@class='shopping_cart_link']") private WebElement cartProduct;
	@FindBy(xpath = "//a[text()='Twitter']") private WebElement twiterLogo;
	@FindBy(xpath = "//a[text()='Facebook']") private WebElement fbLogo;
	@FindBy(xpath = "//a[text()='LinkedIn']") private WebElement linkedLogo;
	@FindBy(xpath = "//button[@name='remove-sauce-labs-backpack']") private WebElement remove1;
	@FindBy(xpath = "//button[@name='remove-sauce-labs-bike-light']") private WebElement remove2;
	@FindBy(xpath = "//span[text()='Your Cart']") private WebElement yourcart;
	
	//constr
	public InventoryPage()
		{
	       	PageFactory.initElements(driver, this);	
		}
		
		
		//method
		public boolean verifySmallLogo()
			{
				return smallLogo.isDisplayed();
			}
			
			public boolean verifyBigLogo()
			{
				return bigLogo.isDisplayed();
			}
			
			public String add6Product() throws Exception
			{
			//    Select a = new Select(sortedDropdown);
			 //   a.selectByVisibleText(ReadData.readExcelFile(0, 0));
				
				utilityMethod.selectClass(sortedDropdown, ReadData.readExcelFile(0, 0));
			    bagpackProduct.click();
			    
			    bikeLightProduct.click();
			    blackTshit.click();
			    jacketProduct.click();
			    labERedProduct.click();
			    redTshirtP.click();  
			    String count = cartProduct.getText();
			    return count;
			}
			
			public boolean verifytwiterLogo()
			{
				return twiterLogo.isDisplayed();
			}
			
			public boolean verifyfbLogo()
			{
				return fbLogo.isDisplayed();
			}
		
			public boolean verifylinkedLogo()
			{
				return linkedLogo.isDisplayed();
			}
			
			public String remove2Product()
			{
				
				remove1.click();
				remove2.click();
				 String count = cartProduct.getText();
				    return count;
			}
			
			public String cartBtn()
			{
				cartProduct.click();
				return yourcart.getText();
			}
			
			}
		
	

