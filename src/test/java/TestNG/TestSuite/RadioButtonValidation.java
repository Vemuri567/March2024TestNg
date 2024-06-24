package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    RadioButtonForm rpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        rpage=new RadioButtonForm(driver);
    }

    @Test
    public void RadioButtonValidation() throws InterruptedException {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button page is not displyed");
        rpage.ClickonRadiobutton("Male");
        rpage.ClickonCheckedValue();
        String acualCHecked=rpage.GetCheckedMessage("Male");
        Assert.assertEquals("Radio button 'Male' is checked",acualCHecked);
        rpage.ClickonRadiobutton("Female");
        rpage.ClickonCheckedValue();
        String acualFemaleCHecked=rpage.GetCheckedMessage("FeMale");
        Assert.assertEquals("Radio button 'FeMale' is checked",acualCHecked);
        rpage.ClickonButton("Male");
        Thread.sleep(2000);
        rpage.ClickonButton("Female");
        rpage.ClickonAgegroup("0 - 5");
        Thread.sleep(2000);
        rpage.ClickonAgegroup("5 - 15");
        Thread.sleep(2000);
        rpage.ClickonAgegroup("15 - 50");
        rpage.ClickonGetvalues();

    }
}
