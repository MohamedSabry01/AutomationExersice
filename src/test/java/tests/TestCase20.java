package tests;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProceedToCheckoutPage;
import pages.ProductsPage;

public class TestCase20 extends TestBase {
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
  public void TestCase_20() throws Exception {
	  Decleration();
	  	
		homePage.clickProductButton();
		Thread.sleep(500);
		productsPage.VerifyUserNavigatedToALLPRODUCTSpage();
		Thread.sleep(500);
		productsPage.EnterProductNameInSearch();
		Thread.sleep(500);
		productsPage.SearchedProductsVisible();
		Thread.sleep(500);
		productsPage.clickMenTshirtViewProductSearch();
		Thread.sleep(500);
		productsPage.MenTshirtAddToCart();
		Thread.sleep(500);
		homePage.clickContinueShoppingButton();
		Thread.sleep(500);
		homePage.clickCartButton();
		Thread.sleep(500);
		productsPage.VerifyMenTshirtInCart();
		Thread.sleep(500);
		homePage.clickSignupLoginButton();
		Thread.sleep(500);
		loginPage.enterCredentials();
		Thread.sleep(500);
		loginPage.clickLoginButton();
		Thread.sleep(500);
		homePage.clickCartButton();
		Thread.sleep(500);
		productsPage.VerifyMenTshirtInCart();
		Thread.sleep(500);
  }
}
