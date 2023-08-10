package curs20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class CssSelectorExample2 extends BaseTest {

	//@Test
	public void cssSelectorTest() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Home page book categories menu entries
		
		//first-of-type ---> New Releases
		WebElement newReleases = driver.findElement
				(By.cssSelector("li[class*='sc_tabs_title']:first-of-type"));
		
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 4px solid red')", newReleases);	
		
		
		//nth-of-type --> Coming soon
		WebElement comingSoon = driver.findElement
				(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(2)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid black')", comingSoon);	
		
		//nth-of-type --> Best Sellers
		WebElement bestSellers = driver.findElement
				(By.cssSelector("li[class*='sc_tabs_title']:nth-of-type(3)"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid black')", bestSellers);
		
		//last-of-type --> Award Winner
		WebElement awardWinners = driver.findElement
				(By.cssSelector("li[class*='sc_tabs_title']:last-of-type"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: purple; border: 4px solid black')", awardWinners);
		
	}
	
	//@Test
	public void cssSelectorsTest2() {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//selectez doar elementul care are atributul ('aria-selected='true'')
		WebElement menuEntry = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: red; border: 4px solid black')", menuEntry);
		
		//selectez tot inafara de elementul care are atributul ('aria-selected='true'')
		//NOT
		
		List<WebElement> menuEntries = driver.findElements
				(By.cssSelector("li[class*='sc_tabs_title']:not([aria-selected='true'])"));
		
		for(WebElement element : menuEntries) {
			jse.executeScript("arguments[0].setAttribute('style', 'background: green; border: 4px solid blue')", element);
		}
	}
	
	@Test
	public void cssSelectorTest3() throws InterruptedException {
		
		//direct child >
		//li[class='menu_user_login']>a[class*='popup_link']
		
		
		//nephew aka nepotu' caracterul spatiul '  ' 
		//ul[class*='menu_user_nav'] a[class*='popup_link']
		
		WebElement loginMenu = driver.findElement(By.cssSelector("ul[class*='menu_user_nav'] a[class*='popup_link']"));
		loginMenu.click();
		Thread.sleep(2000);
		
		//logical AND -- adica tagname [atribut = value ][atribut = value]
		WebElement username = driver.findElement(By.cssSelector("input[id='log'][name='log']"));
		username.sendKeys("TestUser");
		
		//logical OR -- adica tagname [atribut = value ][atribut = value]
		WebElement password = driver.findElement(By.cssSelector("input[type='password'],[name='pwd']"));
		password.sendKeys("Testuser");
	}
	
	
	
}
