package utils_excel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() throws IOException {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider= "test1data")
public void test1(String username,String password) throws InterruptedException {
	System.out.println(username+" | "+password);
	driver.get("https://google.com/");
	driver .findElement(By.name("q")).sendKeys("Automation Step by step");
}
	@DataProvider(name ="test1data")
	public static Object[][] getData() throws IOException {
		String projectPath=System.getProperty("user.dir");
		  Object data[][]=testData(projectPath+"/excel/data.xlsx","Sheet1");
		return data;
		
	}
	public static Object[][] testData(String excelPath, String sheetName) throws IOException
	{
		Excel_Utils excel = new Excel_Utils(excelPath,sheetName);
		int rowCount = excel.getRowCount1();
		int colCount=excel.getColumnCount1();
		
		Object data[][] = new Object[rowCount-1][colCount];
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				String cellData=excel.getCellData(i, j);
				System.out.println(cellData);
				data[i-1][j] =cellData;			
				}
		}
		return data;
	}
}
