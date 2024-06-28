package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    CheckboxForm cpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        cpage=new CheckboxForm(driver);
    }
    @Test
    public void DefaultCheckboxValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        Assert.assertTrue(cpage.VerifyDefaultChecked());
    }

    @Test
    public void VerifyCheckBoxBehaviour()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        cpage.ClickonCheckbox();
        Assert.assertTrue(cpage.VerifySuccessCheckbox());
    }
    @Test
    public void VerifyDefaultDisabled(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        cpage.VerifyDefaultDisabled();
        Assert.assertTrue(cpage.VerifyDefaultDisabled());
    }

    @Test
    public void VerifyCheckAll()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        cpage.ClickonCheckAll();
        Assert.assertTrue(cpage.VerifyUnCheckAll());
        cpage.ClickonCheckAll();
        Assert.assertTrue(cpage.VerifyUnCheckAll());
    }
    @Test
    public void VerifyUncheckAll(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        cpage.ClickOnUncheckAll();
        Assert.assertTrue(cpage.VerifyCheckAll());
    }
    @Test
    public void VerifyOptionsUnchecktoCheck(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"), "checkbox page is not displayed");
        cpage.SelectOption("Option 1");
        Assert.assertTrue(cpage.VerifyCheckAll());
        cpage.SelectOption("Option 2");
        Assert.assertTrue(cpage.VerifyCheckAll());
        cpage.SelectOption("Option 3");
        Assert.assertTrue(cpage.VerifyCheckAll());

    }


}
