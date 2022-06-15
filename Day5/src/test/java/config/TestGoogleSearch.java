package config;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestGoogleSearch {
	
	private static WebDriver driver =null;
 public static	String browserName = null;
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//googleSearch();

	//}
	@BeforeTest
	public void setUpTest() throws IOException {
		String projectPath=System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
		
		 //  System.out.println(projectPath);
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", projectPath+"/drivers/edgedriver/msedgedriver.exe");
		 driver = new EdgeDriver();
	}
	}
	@Test
	public static void googleSearch() throws InterruptedException
	
	{ 
		//String projectPath=System.getProperty("user.dir");
	   //System.out.println(projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		// driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://google.com/");
		//enter the text in search textbox
		//driver .findElement(By.name("q")).sendKeys("Automation Step by step");
		
		GoogleSearch.textbox_search(driver).sendKeys("Automation Step by Step");
		
		//click on search btn
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		GoogleSearch.button_search(driver).sendKeys(Keys.RETURN);
	}
	@AfterTest
		public void tearDownTest1() throws IOException{
			//close the browser
		driver.close();
		System.out.println("Test is completed scccesfully");
		PropertiesFile.setProperties();
	}

	
}