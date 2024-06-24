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
    CheckboxForm cpage;
    RadioButtonForm rpage;
    DropDownForm dpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        fpage=new SimpleForm(driver);
        cpage=new CheckboxForm(driver);
        rpage=new RadioButtonForm(driver);
        dpage=new DropDownForm(driver);

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
        int a=3,b=5;
        fpage.EnterValue1(String.valueOf(a));
        fpage.EnterValue2(String.valueOf(b));
        fpage.ClickonGettotal();
        String total=fpage.Total();
        Assert.assertEquals(Integer.valueOf(total),a+b);
    }
    @Test
    public void CheckboxFormValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Checkbox Demo");
        Assert.assertTrue(cpage.VerifySingleCheckboxDemo("Single Checkbox Demo"),"checkbox page is not displayed");
        cpage.ClickonCheckbox();
        cpage.ClickonCheckAll();
    }
    @Test
    public void RadioButtonValidation() throws InterruptedException {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button page is not displyed");
        rpage.ClickonRadiobutton("Male");
        Thread.sleep(2000);
        rpage.ClickonRadiobutton("Female");
        rpage.ClickonCheckedValue();
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
