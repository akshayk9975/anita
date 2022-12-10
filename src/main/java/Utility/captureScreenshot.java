package Utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TastBase;

public class captureScreenshot extends TastBase {

	public static void screenshot(String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Akshay Kanchangire\\eclipse-workspace\\SauceLabFrame\\Screensot\\"+name+".jpeg");
	    FileHandler.copy(source, dest);
	}
}
