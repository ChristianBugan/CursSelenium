package temacurs21;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;


public class Problema1 extends BaseTest{

	
		
		@Test
		public void reviewCarte() throws InterruptedException {
			
			driver.findElement(By.cssSelector("a[href='life-in-the-garden']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#tab-title-reviews > a")).click();
			
			WebElement saveMyName = driver.findElement(By.cssSelector("#wp-comment-cookies-consent[type='checkbox']"));
			assertFalse(saveMyName.isSelected(), "Checkbox is not selected.");
			System.out.println("Before click :" +saveMyName.isSelected());
			
			saveMyName.click();
			
			driver.findElement(By.cssSelector("input#submit[type='submit']")).click();
			Thread.sleep(3000);
			
			//dupa ce dam click pe submit ne ocupam de alerta 
			
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
		
			//------
			driver.findElement(By.cssSelector("a.star-4")).click();
			
			WebElement yourReview = driver.findElement(By.cssSelector("textarea#comment[name='comment']"));
			yourReview.sendKeys("Review bun. Cristi");
			
			WebElement nume = driver.findElement(By.cssSelector("input#author[name='author'][type='text']"));
			nume.sendKeys("Cristian");
			
			WebElement email = driver.findElement(By.cssSelector("input#email[name='email'][type='email']"));
			email.sendKeys("test@cristian.com");
			
			Thread.sleep(3000);
			
			
			System.out.println("After click :" +saveMyName.isSelected());
			assertTrue(saveMyName.isSelected());
			
			driver.findElement(By.cssSelector("input#submit[type='submit']")).click();
			
			Thread.sleep(2000);
			
			
			
			
		}
	
		
	
}
