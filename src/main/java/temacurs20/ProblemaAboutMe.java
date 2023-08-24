package temacurs20;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import utils.BaseTest;

public class ProblemaAboutMe extends BaseTest {

	@Test(priority=1)
	public void tema20() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement searchButton = driver.findElement(By.cssSelector(".search_submit"));
		searchButton.click();
		Thread.sleep(1000);
		
		WebElement searchField = driver.findElement(By.cssSelector(".search_field"));
		searchField.sendKeys("The story about me");
		Thread.sleep(1000);
		searchButton.click();
		
		WebElement loadMore = driver.findElement(By.cssSelector(".theme_button"));
		loadMore.click();
		Thread.sleep(1000);
		loadMore.click();
		
		WebElement bookClick = driver.findElement(By.cssSelector("a.hover_icon[href=\"https://keybooks.ro/shop/the-story-about-me/\"]"));
		bookClick.click();
		Thread.sleep(1000);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://keybooks.ro/shop/the-story-about-me/";
		
		assertTrue(currentURL.equals(expectedURL));
		
		WebElement addToCart = driver.findElement(By.cssSelector(".single_add_to_cart_button"));
		addToCart.click();
		Thread.sleep(1000);
		
		String expectedText = "“The story about me” has been added to your cart.";
		String actualText = driver.findElement(By.cssSelector("div.woocommerce-message")).getText();
		
		assertTrue(actualText.contains(expectedText));
		
		WebElement viewCart = driver.findElement(By.cssSelector("a.button.wc-forward[href='https://keybooks.ro/cart/'"));
		jse.executeScript("arguments[0].click();", viewCart);
		Thread.sleep(1000);
		
		//viewCart.click();
		
	}
		
		@Test(priority=2)
		public void cartFlow() throws InterruptedException 
		
		{
		
		Thread.sleep(2000);
			
		WebElement increaseQuantity = driver.findElement(By.cssSelector("span.q_inc"));
		increaseQuantity.click();
	
		Thread.sleep(3000);
		
		WebElement updateCart = driver.findElement(By.cssSelector("button.button[name='update_cart']"));
		updateCart.click(); 
		
		String expectedText2 = "Cart updated";
		String actualText2 = driver.findElement(By.cssSelector("div.woocommerce-message")).getText();
		
		assertTrue(actualText2.contains(expectedText2));
		
		WebElement proceedCheckout = driver.findElement
				(By.cssSelector("a.checkout-button.button.alt.wc-forward[href='https://keybooks.ro/checkout/']"));
		proceedCheckout.click();
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://keybooks.ro/checkout/";
		
		assertTrue(currentURL.equals(expectedURL));
		
		// Billing details - div[class='woocommerce-billing-fields']>h3
		
		String expectedText3 = "Billing details";
		String actualText3 = driver.findElement(By.cssSelector("div[class='woocommerce-billing-fields']>h3")).getText();
		
		assertTrue(actualText3.contains(expectedText3));
		
		//woocommerce-additional-fields
		
		String expectedText4 = "Additional information";
		String actualText4 = driver.findElement(By.cssSelector("div[class='woocommerce-additional-fields']>h3")).getText();
		
		assertTrue(actualText4.contains(expectedText4));
	
		}
		
		
		
		
	}
	
	

