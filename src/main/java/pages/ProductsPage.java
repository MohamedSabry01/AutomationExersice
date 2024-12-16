package pages;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void VerifyUserNavigatedToALLPRODUCTSpage() {
    	Assert.assertTrue(driver.getCurrentUrl().contains("products"), "User is not navigated to the ALL PRODUCTS page.");
    }
    
    public void EnterProductNameInSearch() {
    String searchQuery = "Men Tshirt";
    driver.findElement(By.id("search_product")).sendKeys(searchQuery);
    driver.findElement(By.id("submit_search")).click();
    }
    
    public void SearchedProductsVisible() {
    	WebElement searchedProductsHeader = driver.findElement(By.xpath("//h2[contains(text(), 'Searched Products')]"));
        Assert.assertTrue(searchedProductsHeader.isDisplayed(), "'SEARCHED PRODUCTS' is not visible.");
    }
    
    public void clickMenTshirtViewProduct() {
    	driver.findElement(By.xpath("/html/body/section[2]/div/div[1]/div[2]/div[1]/div[3]/div/div[2]/ul/li/a")).click();
    }
    
    public void clickMenTshirtViewProductSearch() {
    	driver.findElement(By.cssSelector("body > section:nth-child(3) > div.container > div > div.col-sm-9.padding-right > div > div.col-sm-4 > div > div.choose > ul > li > a")).click();
    }
    
    public void MenTshirtAddToCart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
    }
    
    public void VerifyMenTshirtInCart() {
    	WebElement MenTshirt = driver.findElement(By.cssSelector("#product-2 > td.cart_description > h4 > a"));
		Assert.assertTrue(MenTshirt.isDisplayed(), "Men Tshirt");
    }
    
    public WebElement getWomenCategoryButton() {
        return driver.findElement(By.cssSelector("a[href='/women'][class='category-button']")); // Adjust selector if needed
    }

    public WebElement getMenCategoryButton() {
        return driver.findElement(By.cssSelector("a[href='/men']")); // Adjust selector if needed
    }

    public WebElement getKidsCategoryButton() {
        return driver.findElement(By.cssSelector("a[href='/kids']")); // Adjust selector if needed
    }
    
    private boolean isElementDisplayed(By cssSelector) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clickMenCategoryButton() {
        getMenCategoryButton().click();
    }
	public void verifyMenProductsDisplayed() {
        assertTrue(isElementDisplayed(By.cssSelector("a[href='/men/tshirts']")), "Tshirts category is not displayed");
        assertTrue(isElementDisplayed(By.cssSelector("a[href='/men/jeans']")), "Jeans category is not displayed");
    }
	
    public void clickKidsCategoryButton() {
        getKidsCategoryButton().click();
    }
    public void verifyKidsProductsDisplayed() {
        assertTrue(isElementDisplayed(By.cssSelector("a[href='/kids/dress']")), "Dress category is not displayed");
        assertTrue(isElementDisplayed(By.cssSelector("a[href='/kids/tops-shirts']")), "Tops & Shirts category is not displayed");
    }
    
    public void verifyTopLevelCategoriesDisplayed() {
        assertTrue(getWomenCategoryButton().isDisplayed());
        assertTrue(getMenCategoryButton().isDisplayed());
        assertTrue(getKidsCategoryButton().isDisplayed());
    }

}
