package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    SimpleForm fpage;

    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        fpage=new SimpleForm(driver);

    }
    @Test
    public void InputFormValidations(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Simple Form Demo");
        Assert.assertTrue(fpage.VerifySingleinpufield("Single Input Field"),"Simpleform pClickonEntermessageage is not displayed");
        String message="hi friends";
        fpage.Entermessage(message);
        fpage.ClickonShowMessage();
        String actualmessage=fpage.Getmessage();
        Assert.assertEquals(actualmessage,message);

    }

    @Test
    public void TwoInputFieldValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Simple Form Demo");
        Assert.assertTrue(fpage.VerifySingleinpufield("Single Input Field"),"Simpleform pClickonEntermessageage is not displayed");
        int a=3,b=5;
        fpage.EnterValue1(String.valueOf(a));
        fpage.EnterValue2(String.valueOf(b));
        fpage.ClickonGettotal();
        String total=fpage.Total();
        Assert.assertEquals(Integer.valueOf(total),a+b);
    }

}
