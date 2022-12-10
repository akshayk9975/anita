package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TastBase {

	public static WebDriver driver;
	public void initalization() throws Exception
	{
		String browser = ReadData.readPropertyFile("browser");
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//	driver.get("https://www.saucedemo.com/");
		driver.get(ReadData.readPropertyFile("url"));
	}
}
 //i push the code on git hub everone can acces