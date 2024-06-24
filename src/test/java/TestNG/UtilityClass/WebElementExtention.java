package TestNG.UtilityClass;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WebElementExtention {
    WebDriver driver;
    public WebElementExtention(WebDriver driver){
        this.driver=driver;
    }
    public WebElement Getwebelement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    public boolean VerifyWebElement(String xpath){
        return Getwebelement(xpath).isDisplayed();
    }
    public boolean VerifyDynamicWebelement(String xpath,String text){
        return GetDynamicWebelement(xpath,text).isDisplayed();
    }
    public void ClickonWebElement(String xpath){
        Getwebelement(xpath).click();
    }
    public String GetText(String xpath){
        return Getwebelement(xpath).getText();
    }
    public String GetTextForDynamicXpath(String xpath,String text){
        return GetDynamicWebelement(xpath,text).getText();
    }
    public void ClickonDynamicWebElement(String xpath,String text){
        GetDynamicWebelement(xpath,text).click();
    }
    public void EnterText(String xpath,String text){
        Getwebelement(xpath).sendKeys(text);
    }
    public WebElement GetDynamicWebelement(String xpath,String text){
        xpath=xpath.replace("%s",text);
        return driver.findElement(By.xpath(xpath));
    }
    public void ClickonDropdown(String xpath,String text){
        Getwebelement(xpath).isSelected();
    }
}
