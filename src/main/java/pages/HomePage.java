package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {

    private WebDriver driver;
    
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignupLoginButton() {
		driver.findElement(By.linkText("Signup / Login")).click();		
	}
    
    public void clickContinueShoppingButton() {
        driver.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();;
       }
    
    public void clickCartButton() {
     driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).click();;
    }
    
    public void clickProductButton() {
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();;
       }
    
    public void verifyingBrandsDisplayed() {
    	WebElement Brands = driver.findElement(By.cssSelector("div[class='brands-name']"));
    	Assert.assertTrue(Brands.isDisplayed(), "Brands");
    }
    
    public void clickPOLObutton() {
        driver.findElement(By.cssSelector("a[href='/brand_products/Polo']")).click();;
       }
    
    public void verifyingNavigatedPOLO() {
    	WebElement POLOnavigated = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
	    Assert.assertTrue(POLOnavigated.isDisplayed(), "Brand -  Polo Products");
    }
    
    public void clickBABYUGbutton() {
        driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div/ul/li[5]/a")).click();;
       }
    
    public void verifyingNavigatedBABYUG() {
    	WebElement BABYUGnavigated = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
	    Assert.assertTrue(BABYUGnavigated.isDisplayed(), "Brand -  Babyhug Products");
    }
    
    public void clickWomenCategoryButton() {
    	driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();
    }
    
    public void clickWomenDressButton() {
    	driver.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();
    }
    
    public void verifyingWomenDressProductsDisplayed() {
    	WebElement WomenDressProducts = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
	    Assert.assertTrue(WomenDressProducts.isDisplayed(), "Women -  Dress Products");
    }
    
    public void clickMenCategoryButton() {
        driver.findElement(By.xpath("//*[@id=\"accordian\"]/div[2]/div[1]/h4/a")).click();
    }
    
    public void clickMenJeansButton() {
    	driver.findElement(By.xpath("//*[@id=\"Men\"]/div/ul/li[2]/a")).click();
    }
    
    public void verifyingMenJeansProductsDisplayed() {
    	WebElement MenJeansProducts = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/h2"));
	    Assert.assertTrue(MenJeansProducts.isDisplayed(), "Men -  Jeans Products");
    }
    
}