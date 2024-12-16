package tests;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProceedToCheckoutPage;
import pages.ProductsPage;
import org.testng.annotations.Test;

public class TestCase16 extends TestBase {
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
  public void TestCase_16() throws Exception {
	  Decleration();
	homePage.clickSignupLoginButton();
	loginPage.enterCredentials();
	loginPage.clickLoginButton();
	productsPage.clickMenTshirtViewProduct();
	Thread.sleep(500);
	productsPage.MenTshirtAddToCart();
	Thread.sleep(500);
	Thread.sleep(500);
	homePage.clickContinueShoppingButton();
	Thread.sleep(1000);
	homePage.clickCartButton();
	Thread.sleep(500);
	cartpage.VerifCartPageDisplayed();
	Thread.sleep(500);
	cartpage.clickProceedToCheckout();
	Thread.sleep(500);
	proceedtocheckoutpage.writeComment();
	Thread.sleep(500);
	proceedtocheckoutpage.clickPlaceOrderButton();
	Thread.sleep(500);
	paymentpage.enterPaymentInfo();
	Thread.sleep(500);
	paymentpage.clickPayAndConfirmOrder();
	paymentpage.verifyOrderSuccessfullyMessgae();
	Thread.sleep(500);
  }
}
