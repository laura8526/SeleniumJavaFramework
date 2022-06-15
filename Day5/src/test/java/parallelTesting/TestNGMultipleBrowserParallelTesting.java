package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultipleBrowserParallelTesting {

	WebDriver driver = null;
	String projectPath=System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser name is :  "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
			 driver = new ChromeDriver();			
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath+"/drivers/edgedriver/msedgedriver.exe");
			 driver = new EdgeDriver();
			
		}
	}
	
	@Test
	public void test1() throws InterruptedException {
		driver.get("https://ebay.com");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}