package TestNG.Page;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
    WebDriver driver;
   private String loginLink="//span[text()='Log In']";
    private String emailxpath="//input[@name='email']";
    private String passwordxpath="//input[@name='password']";
    private String loginxpath="//div[text()='Login']";
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public  void NavigateToUrl(String url){
       driver.get(url);
    }
    public void CurrentUrl(String url){
        driver.get(url);
    }
    String navigate="https://www.freecrm.com/";
    public void ClickOnLoginLink(){
       driver.findElement(By.xpath(loginLink)).click();
    }
    public void EnterEmail(String email){
        driver.findElement(By.xpath(emailxpath)).sendKeys(email);
    }
    public void EnterPassword(String password){
        driver.findElement(By.xpath(passwordxpath)).sendKeys(password);
    }
    public HomePage LogIn(){
        driver.findElement(By.xpath(loginxpath)).click();
        return new HomePage(driver);
    }
}
