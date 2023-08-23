package temacurs19;


import static org.testng.Assert.assertEquals;

/*
 * Vom face un script care verifica daca cartea "The Forest" se afla in cele 4 categorii din pagina principala si 
 * daca linkul cartii ne deschide pagina de produs cand ajungem in ultima categorie
 * Cele 4 categorii: "New Releases" | "Coming soon" | "Best sellers" | "Award WINNERS"
 * 
 * Scriptul are 1 metoda @test
 * Elementele meniului le identificam cu pe baza atributului class "sc_tabs_title" si vom crea o lista cu ele
 * vom itera lista cu un FOR si vom da click pe fiecare element al listei astfel incat sa trecem prin cele 4 categorii
 * 
 * In fiecare dintre categorii vom face o verificare sa stim daca cartea "The forest" este displayed.
 * cand ajungem la ultimul element al listei, vom da click pe carte 
 * si vom verifica daca face redirect catre URL-ul: " https://keybooks.ro/shop/the-forest/ "
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class ExercitiulForest extends BaseTest {

	@Test
	public void ForestBook() throws InterruptedException {
	
JavascriptExecutor jse = (JavascriptExecutor) driver;
        
        List<WebElement> booksCategories = driver.findElements(By.cssSelector("li[class~='sc_tabs_title']"));
        System.out.println(booksCategories.size());
        
        for (WebElement category : booksCategories) {
            jse.executeScript("arguments[0].setAttribute('style', 'background: white; border: 2px solid red')", category);
            category.click();
            Thread.sleep(1000); 
            // Verificam daca cartea "The forest" este afișata în cadrul categoriei curente
            List<WebElement> booksInCategory = driver.findElements(By.partialLinkText("The forest"));
            
            if (!booksInCategory.isEmpty()) {
                System.out.println("The Forest book is displayed in the category: " + category.getText());
                
                if (category.equals(booksCategories.get(booksCategories.size() - 1))) {
                    // Daca suntem in ultima categorie, dam click pe cartea "The forest" și verificam URL-ul
                    booksInCategory.get(0).click();
                    assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/the-forest/");
                    System.out.println("The forest book redirected to the correct URL.");
                }
            } else {
                System.out.println("The forest book is not displayed in the category: " + category.getText());
            }
        }
	
	}
	
}
