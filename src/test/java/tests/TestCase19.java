package tests;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProceedToCheckoutPage;
import pages.ProductsPage;

public class TestCase19 extends TestBase {
	HomePage homePage;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartpage;
    ProceedToCheckoutPage proceedtocheckoutpage;
    PaymentPage paymentpage;
    
    public void Decleration() {
    	homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartpage = new CartPage(driver);
        proceedtocheckoutpage = new ProceedToCheckoutPage(driver);
        paymentpage = new PaymentPage(driver);
	}
  @Test
  public void TestCase_19() throws Exception {
	  Decleration();
	  	homePage.clickSignupLoginButton();
	  	Thread.sleep(500);
		loginPage.enterCredentials();
		Thread.sleep(500);
		loginPage.clickLoginButton();
		Thread.sleep(500);
		homePage.clickProductButton();
		Thread.sleep(500);
		homePage.verifyingBrandsDisplayed();
		Thread.sleep(500);
		homePage.clickPOLObutton();
		Thread.sleep(500);
		homePage.verifyingNavigatedPOLO();
		Thread.sleep(500);
		homePage.clickBABYUGbutton();
		Thread.sleep(500);
		homePage.verifyingNavigatedBABYUG();
		Thread.sleep(500);
  }
}
