package tests;

import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.PaymentPage;
import pages.ProceedToCheckoutPage;
import pages.ProductsPage;

public class TestCase18 extends TestBase {
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
  public void TestCase_18() throws Exception {
	  Decleration();
	  homePage.clickSignupLoginButton();
		loginPage.enterCredentials();
		loginPage.clickLoginButton();
		Thread.sleep(500);
		homePage.clickWomenCategoryButton();
		Thread.sleep(500);
		homePage.clickWomenDressButton();
	    Thread.sleep(500);
	    homePage.verifyingWomenDressProductsDisplayed();
	    Thread.sleep(500);
	    homePage.clickMenCategoryButton();
	    Thread.sleep(500);
	    homePage.clickMenJeansButton();
	    Thread.sleep(500);
	    homePage.verifyingMenJeansProductsDisplayed();
	    Thread.sleep(500);
  }
}
