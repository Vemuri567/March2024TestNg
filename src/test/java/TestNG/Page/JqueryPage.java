package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JqueryPage extends WebElementExtention {
    public WebDriver driver;
    public JqueryPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    String countryXpath="//span[@aria-labelledby='select2-country-container']";
    String countryDropdownSearchXpath="//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']";
    String countrySelectionXpath="//li[text()='%s']";
    String terriotiryXpath="//label[text()='Select US Outlying Territories :']/..//span[@class='select2-selection__rendered']";
    String searchTerriotiry="//span[@class='select2-search select2-search--dropdown']//input[@class='select2-search__field']";
    String terriotiryOptionsXpath="//li[contains(@class,'select2-results__option')]";
    public void SelectCountryWithSearchOption(String country)
    {
        ClickonWebElement(countryXpath);
        ClearInputFields(countryDropdownSearchXpath);
        EnterText(countryDropdownSearchXpath,country);
        ClickonDynamicWebElement(countrySelectionXpath,country);
    }

    public Boolean VerifyJqueryPageLoaded(){
        return  VerifyWebElement(countryXpath);
    }

    public String GetSelectedOption()
    {
        return GetText(countryXpath);
    }

    public String GetSelectedTerriotiryOption()
    {
        return GetText(terriotiryXpath);
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
        ClickonWebElement(terriotiryXpath);
        return enabledCountries;
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
                String arialabelAttribute=GetAttributeValue(item,"aria-disabled");
                if(arialabelAttribute.equals("true"))
                {
                    String text=item.getText();
                    disabledCountries.add(text);
                }
            }
        }
        ClickonWebElement(terriotiryXpath);
        return disabledCountries;
    }
    public void SelectTerriotiry(String country)
    {
        ClickonWebElement(terriotiryXpath);
        ClearInputFields(searchTerriotiry);
        EnterText(searchTerriotiry,country);
        ClickonDynamicWebElement(countrySelectionXpath,country);
    }
}
