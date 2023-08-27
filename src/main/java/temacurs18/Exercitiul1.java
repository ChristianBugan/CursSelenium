package temacurs18;



import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Exercitiul1 extends BaseTest {

	@Test
	public void LoginLocator() throws InterruptedException {
		
		WebElement loginMenu = driver.findElement(By.cssSelector("ul[class*='menu_user_nav'] a[class*='popup_link']"));
		
		WebElement username = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		
		WebElement password = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
		
		assertFalse(username.isDisplayed());

		assertFalse(password.isDisplayed());
		
		loginMenu.click();
		Thread.sleep(2000); 
		
		assertTrue(username.isDisplayed());

		assertTrue(password.isDisplayed());
		
		
	}
	
	
	
}
