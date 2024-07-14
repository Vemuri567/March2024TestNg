package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class JQuerySelectDropdown extends WebElementExtention {
    public WebDriver driver;
    String verifyelement="//h3[text()='Drop Down with Search box']";
    String selectcountryboxxpath="//span[@aria-labelledby='select2-country-container']";
    String selectsearchboxxpath="//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']";
    String selectcountryxpath="//li[text()='%s']";
    String selectstatexpath="//input[@placeholder='Select state(s)']";
    String stateselectionxpath="//li[text()='%s']";

    String terriotiryXpath="//label[text()='Select US Outlying Territories :']/..//span[@class='select2-selection__rendered']";
    String searchTerriotiry="//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']";
    String terriotiryOptionsXpath="//li[contains(@class,'select2-results__option')]";

    String selectfilesearchboxxpath="//select[@name='files']";

    public JQuerySelectDropdown(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyDropdownsearchbox(){
        return VerifyWebElement(verifyelement);
    }
    public void SelectCountry(String country){
        ClickonWebElement(selectcountryboxxpath);
        EnterText(selectsearchboxxpath,country);
        ClickonDynamicWebElement(selectcountryxpath,country);
   }
   public String GetSelectedCountry(){
        return GetText(selectcountryboxxpath);
   }

    public void ClickOnSelectStatesBox(){
        ClickonWebElement(selectstatexpath);
    }
    public void SelectStates(String state){
        EnterText(selectstatexpath,state);
        Actions builder=new Actions(driver);
        builder.sendKeys(Keys.ENTER);
        ClickonDynamicWebElement(stateselectionxpath,state);
    }

    public String GetSelectedTerriotiryOption()
    {
        return GetText(terriotiryXpath);
    }
    public List<String> GetAllDisabledCountries()
    {
        List<String> disabledCountries=new ArrayList<>();
        ClickonWebElement(terriotiryXpath);
        List<WebElement> allOptions=driver.findElements(By.xpath(terriotiryOptionsXpath));
        if(allOptions.size()>0)
        {
            for(WebElement item:allOptions)
            {
                String arialabelAttribute= GetAttributeValue(item,"aria-disabled");
                if(arialabelAttribute=="true")
                {
                    String text=item.getText();
                    disabledCountries.add(text);
                }
            }
        }
        ClickonWebElement(terriotiryXpath);
        return disabledCountries;
    }

    public List<String> GetAllEnabledCountries()
    {
        List<String> enabledCountries=new ArrayList<>();
        ClickonWebElement(terriotiryXpath);
        List<WebElement> allOptions=driver.findElements(By.xpath(terriotiryOptionsXpath));
        if(allOptions.size()>0)
        {
            for(WebElement item:allOptions)
            {
                String arialabelAttribute=GetAttributeValue(item,"aria-disabled");
                if(arialabelAttribute==null)
                {
                    String text=item.getText();
                    enabledCountries.add(text);
                }
            }
        }
        ClickonWebElement(terriotiryOptionsXpath);
        return enabledCountries;
    }
    public void SelectTerriotiry(String country)
    {
        ClickonWebElement(terriotiryXpath);
        ClearInputFields(searchTerriotiry);
        EnterText(searchTerriotiry,country);
        ClickonDynamicWebElement(selectcountryxpath,country);
    }



    public void ClickOnSelectFile(String language){
        ClickonWebElement(selectfilesearchboxxpath);
        SelectDropdownOptionByVisibletext(selectfilesearchboxxpath,language);
    }
    public void SelectLanguageByValue(String value){
        SelectDropdownOptionByValue(selectfilesearchboxxpath,value);
    }
    public String SelectLanguageByIndex(int i){
        return SelectDropdownOptionByIndex(selectfilesearchboxxpath,i);
    }



 /* String clickdropdown="//span[@class='select2-selection__rendered' and @title='%s']";
  String serchbox=""
*/

}
