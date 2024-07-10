package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.DropDownForm;
import TestNG.Page.JQuerySelectDropdown;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class JQuerySelectDropdownValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    JQuerySelectDropdown jpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        jpage=new JQuerySelectDropdown(driver);

    }
    @Test
    public void SingleSelectValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jpage.VerifyDropdownsearchbox());
        String country="Japan";
        jpage.SelectCountry(country);
        String actual=jpage.GetSelectedCountry();
        Assert.assertEquals(actual,country);
    }

    @Test
    public void SelectMultipleStatesValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jpage.VerifyDropdownsearchbox());
        jpage.ClickOnSelectStatesBox();
        jpage.SelectStates("Alaska");

    }
    @Test
    public void SelectEnabledItemFromTerriotiryDropdwon()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jpage.VerifyDropdownsearchbox(),"jqueryDropdown Page is not displayed");
        List<String> enabledTerriotries= jpage.GetAllEnabledCountries();
        if(enabledTerriotries.size()>0)
        {
            String secondItem=enabledTerriotries.get(1);
            jpage.SelectTerriotiry(secondItem);
            Assert.assertEquals(jpage.GetSelectedTerriotiryOption(),secondItem);
            for(String Options:enabledTerriotries){
                System.out.println(Options);
            }
        }
        else
        {
            Assert.fail("Terriotiry dropdown options are not displaying");
        }
    }
   /* @Test
    public void SelectDisabledItemFromTerriotiryDropdwon()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jpage.VerifyDropdownsearchbox(),"jqueryDropdown Page is not displayed");
        List<String> disabledTerriotries= jpage.GetAllDisabledCountries();
        if(disabledTerriotries.size()>0)
        {
            String secondItem=disabledTerriotries.get(1);
            jpage.SelectTerriotiry(secondItem);
            Assert.assertEquals(jpage.GetSelectedTerriotiryOption(),secondItem);
        }
        else
        {
            Assert.fail("Terriotiry dropdown options are not displaying");
        }
    }*/

    @Test
    public void DropdownWithCategory(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("JQuery Select dropdown");
        Assert.assertTrue(jpage.VerifyDropdownsearchbox());
        //jpage.ClickOnSelectFile("C");
        //jpage.SelectLanguageByValue("jqueryui");
        int index= Integer.valueOf(5);
        jpage.SelectLanguageByIndex(index);

    }
}
