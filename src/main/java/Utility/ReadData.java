package Utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String readPropertyFile(String value) throws Exception
	{
    Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\Akshay Kanchangire\\eclipse-workspace\\SauceLabFrame\\TestData\\config.property");
    prop.load(file);
    return prop.getProperty(value);
    }
	
	public static String readExcelFile(int row,int cell) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Akshay Kanchangire\\eclipse-workspace\\SauceLabFrame\\TestData\\shee1.xlsx");
		Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
		String value = excel.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	

}   
