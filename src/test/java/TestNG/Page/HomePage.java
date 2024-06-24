package TestNG.Page;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    static WebDriver driver;
    private String userNamexpath="//span[@class='user-display']";
    private String contactsxpath="//i[@class='users icon']";
    private String dealsxpath="//span[text()='Deals']";
    private String d1="//span[text()='Deals'and @class='selectable ']";
    private String checkBoxXpath="//a[text()='vemuri srikanth']/..//preceding-sibling::td//input";
    private String dealscheckboxXpath="//input[@type='checkbox']";

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String VerifyUserName(){
        String text=driver.findElement(By.xpath(userNamexpath)).getText();
        return text;
    }
   public Contacts ClickonContacts(){
        driver.findElement(By.xpath(contactsxpath)).click();
        return new Contacts(driver);
   }
    public Deals ClickonDeals(){
        driver.findElement(By.xpath(dealsxpath)).click();
        return new Deals(driver);
    }


}
