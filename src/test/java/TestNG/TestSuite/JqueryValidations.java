package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.JqueryPage;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import TestNG.Page.SimpleForm;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JqueryValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    SimpleForm fpage;
    JqueryPage jqpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        fpage=new SimpleForm(driver);
        jqpage=new JqueryPage(driver);
    }

    @Test
    public void CountryDropdownValidationWithSearch()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jqpage.VerifyJqueryPageLoaded(),"jqueryDropdown Page is not displayed");
        String expectedcountry="Australia";
        jqpage.SelectCountryWithSearchOption(expectedcountry);
        String selectedCountry=jqpage.GetSelectedOption();
        Assert.assertEquals(selectedCountry,expectedcountry);
    }

    @Test
    public void SelectEnabledItemFromTerriotiryDropdwon()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jqpage.VerifyJqueryPageLoaded(),"jqueryDropdown Page is not displayed");
        List<String> enabledTerriotries= jqpage.GetAllEnabledCountries();
        if(enabledTerriotries.size()>0)
        {
            String secondItem=enabledTerriotries.get(1);
            jqpage.SelectTerriotiry(secondItem);
            Assert.assertEquals(jqpage.GetSelectedTerriotiryOption(),secondItem);
        }
        else
        {
            Assert.fail("Terriotiry dropdown options are not displaying");
        }
    }
}
