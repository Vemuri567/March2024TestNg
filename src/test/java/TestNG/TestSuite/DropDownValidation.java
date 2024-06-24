package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    DropDownForm dpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        dpage=new DropDownForm(driver);
    }
    @Test
    public void DropdownListValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Select Dropdown List");
        Assert.assertTrue(dpage.VerifySelectList("Select List Demo"),"Dropdown page is not displayed");
        // dpage.SelectaDay("Wednesday","Tuesday");

    }
}
