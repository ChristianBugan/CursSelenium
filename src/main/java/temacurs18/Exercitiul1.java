package temacurs18;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Exercitiul1 extends BaseTest {

	@Test
	public void LoginLocator() throws InterruptedException {
		
		WebElement loginMenu = driver.findElement(By.cssSelector("ul[class*='menu_user_nav'] a[class*='popup_link']"));
		loginMenu.click();
		Thread.sleep(2000); 
		
		WebElement username = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		 if (username.isDisplayed()) {
	            System.out.println("Username field is displayed.");
	        } else {
	            System.out.println("Username field is not displayed.");
	        }
	
		WebElement password = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
		  if (password.isDisplayed()) {
	            System.out.println("Password field is displayed.");
	        } else {
	            System.out.println("Password field is not displayed.");
	        }
		
	}
	
	
	
}
