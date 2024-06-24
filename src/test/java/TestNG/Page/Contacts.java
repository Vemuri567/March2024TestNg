package TestNG.Page;

import TestNG.BaseClass;
import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Contacts extends WebElementExtention {
    WebDriver driver;
    private String checkBoxXpath="//a[text()='vemuri srikanth']/..//preceding-sibling::td//input";
    public Contacts(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public Contacts ClickContacts(){
         driver.findElement(By.xpath(checkBoxXpath)).click();
         return new Contacts(driver);
    }

}
