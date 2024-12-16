package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PaymentPage {

	private WebDriver driver;

	public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }
	
	public void enterPaymentInfo() {
		driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[1]/div/input")).sendKeys("John Doe");
	    driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[2]/div/input")).sendKeys("4111111111111111");
	    driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[1]/input")).sendKeys("123");
	    driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[2]/input")).sendKeys("12");
	    driver.findElement(By.xpath("//*[@id=\"payment-form\"]/div[3]/div[3]/input")).sendKeys("2025");
	}
	
	public void clickPayAndConfirmOrder() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	
	public void verifyOrderSuccessfullyMessgae() {
		WebElement OrderSuccessfullyMessgae = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/p"));
		Assert.assertTrue(OrderSuccessfullyMessgae.isDisplayed(), "Congratulations! Your order has been confirmed!");
	}
    
}
