package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage {
	private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void VerifCartPageDisplayed() {
    	WebElement ShoppingCart = driver.findElement(By.cssSelector("#cart_items > div > div.breadcrumbs > ol > li.active"));
		Assert.assertTrue(ShoppingCart.isDisplayed(), "Shopping Cart");
    }
    
    public void clickProceedToCheckout() {
        driver.findElement(By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a")).click();
        }
    
    public void clickRemoveButton() {
        driver.findElement(By.xpath("//*[@id=\"product-2\"]/td[6]/a")).click();
        }
    
    public void verifyEmptyCartMessage() {
        WebElement emptyCartMessage = driver.findElement(By.cssSelector("#empty_cart > p > b"));
		Assert.assertTrue(emptyCartMessage.isDisplayed(), "Cart is empty!");
    }
    
}
