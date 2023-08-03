package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();//face maximize la browser.
		
		driver.get("https://keybooks.ro/");
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(4000); // BAD PRACTICE - aduci timpi morti
		driver.close();
	}
	
}
