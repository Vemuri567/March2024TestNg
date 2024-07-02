package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.AjaxFormSubmit;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxFormSubmitValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    AjaxFormSubmit apage;
    @BeforeMethod
    public void InitObjects() {
        lpage = new LoginPage(driver);
        shomepage = new SeleniumEasyHomePage(driver);
        apage=new AjaxFormSubmit(driver);
    }
    @Test
    public void AjaxFormValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Ajax Form Submit");
        Assert.assertTrue(apage.VerifyAjaxForm("Ajax Form"),"Ajax form submit page is not displayed");
        String name="abcdef";
        String description="Ajax form submit with loading icon";
        apage.EnterName(name);
        apage.EnterDiscription(description);
        apage.ClickOnSubmit();
        Assert.assertTrue(apage.GetSubmittedmessage());

    }
}
