package TestNG.UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

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
    public void ClearText(String xpath){
        Getwebelement(xpath).click();
    }
    public boolean ClickonWebElement(String xpath){
        Getwebelement(xpath).click();
        return false;
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
    public void EnterDynamicText(String xpath,String text){
        GetDynamicWebelement(xpath,text).sendKeys(text);
    }
    public WebElement GetDynamicWebelement(String xpath,String text){
        xpath=xpath.replace("%s",text);
        return driver.findElement(By.xpath(xpath));
    }
    public void SelectDropdownOptionByVisibletext(String xpath,String option){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText(option);
    }
    public void SelectDropdownOptionByValue(String xpath,String value){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(value);
    }
    public String SelectDropdownOptionByIndex(String xpath, String index){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(index);
        return xpath;
    }
    public List<String> GetDropdownitems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String text=alloptions.get(i).getText();
            items.add(text);
        }
        return items;
    }

    public List<String> GetDropdownDiasbleditems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String disabled=alloptions.get(i).getAttribute("aria-disabled");
            if(disabled.equals("true")){
                String text=alloptions.get(i).getText();
                items.add(text);
            }

        }
        return items;
    }


    public List<String> GetDropdownEnableditems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String disabled=alloptions.get(i).getAttribute("aria-disabled");
            if(disabled.equals("")){
                String text=alloptions.get(i).getText();
                items.add(text);
            }

        }
        return items;
    }
    public String SelectDropdownOptionByIndex(String xpath, int index){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(index);
        return xpath;
    }
    public void ClearInputFields(String xpath){
        Getwebelement(xpath).clear();
    }

    public void PressControlFromKeyaboard()
    {
        Actions builder=new Actions(driver);
        builder.sendKeys(Keys.CONTROL);
    }
    public void PressEnterFromKeyaboard()
    {
        Actions builder=new Actions(driver);
        builder.sendKeys(Keys.ENTER);
    }
    public String GetAttributevalue(String xpath,String name){
        return Getwebelement(xpath).getAttribute(name);
    }
    public String GetAttributeValue(WebElement element, String name){
        return element.getAttribute(name);
    }
}