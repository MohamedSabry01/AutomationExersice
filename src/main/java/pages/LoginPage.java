package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    private By signupLoginButton = By.cssSelector("a[href='/login']");
    
    private By loginButton = By.xpath("//button[text()='Login']");

    
    
    public WebDriver getDriver() {
        return driver;
    }
    
    public void navigateToLoginPage() {
        driver.get("http://automationexercise.com");

        if (!driver.findElement(signupLoginButton).isDisplayed()) {
            throw new RuntimeException("Signup/Login button not found on homepage!");
        }

        driver.findElement(signupLoginButton).click();
    }
    
    public void enterCredentials() {
        driver.findElement(By.name("email")).sendKeys("mohamedsabryabdalghany@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456789");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

	

  }
