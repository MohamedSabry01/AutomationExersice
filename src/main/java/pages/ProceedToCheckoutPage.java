package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckoutPage {

	private WebDriver driver;

	public ProceedToCheckoutPage(WebDriver driver) {
        this.driver = driver;
    }
		
	public void writeComment() {
        driver.findElement(By.xpath("//*[@id=\"ordermsg\"]/textarea")).sendKeys("Mission Done");
    }
	
	public void clickPlaceOrderButton () {
        driver.findElement(By.xpath("//*[@id=\"cart_items\"]/div/div[7]/a")).click();
    }
	

}
