package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProceedToCheckoutPage;
import pages.ProductsPage;

public class TestCase17 extends TestBase {
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
  public void TestCase_17() throws Exception {
	  Decleration();
	  homePage.clickSignupLoginButton();
		loginPage.enterCredentials();
		loginPage.clickLoginButton();
		productsPage.clickMenTshirtViewProduct();
		Thread.sleep(500);
		productsPage.MenTshirtAddToCart();
		Thread.sleep(500);
		homePage.clickContinueShoppingButton();
		Thread.sleep(500);
		homePage.clickCartButton();
		Thread.sleep(500);
		cartpage.VerifCartPageDisplayed();
		Thread.sleep(500);
		cartpage.clickRemoveButton();
		Thread.sleep(500);
		cartpage.verifyEmptyCartMessage();
		Thread.sleep(500);
  }
}
