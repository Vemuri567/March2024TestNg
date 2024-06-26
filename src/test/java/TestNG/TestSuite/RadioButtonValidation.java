package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import com.beust.ah.A;
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
    public void RadioButtonValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button page is not displyed");
        rpage.ClickonRadiobutton("Male");
        rpage.ClickonGetCheckedValue();
        String acualmaleChecked=rpage.GetCheckedMessage("Male");
        Assert.assertEquals("Radio button 'Male' is checked",acualmaleChecked);

    }
    @Test
    public void RadioButtonFemale(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button page is not displyed");
        rpage.ClickonRadiobutton("Female");
        rpage.ClickonGetCheckedValue();
        String acualFemaleChecked=rpage.GetCheckedMessage("FeMale");
        Assert.assertEquals("Radio button 'FeMale' is checked",acualFemaleChecked);

    }
    @Test
    public void GroupRadioButtonsMale(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Male";
        String agegroup="0 - 5";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String acualmaleChecked=rpage.GetValesMessage();
        Assert.assertEquals(acualmaleChecked,expectedradiobuttonchecked);


    }
    @Test
    public void GroupRadioButtonFemale(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Female";
        String agegroup="0 - 5";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String actualradiobuttonchecked=rpage.GetValesMessage();
        Assert.assertEquals(actualradiobuttonchecked,expectedradiobuttonchecked);
        Assert.assertTrue(actualradiobuttonchecked.contains(gender));
        Assert.assertTrue(actualradiobuttonchecked.contains(agegroup));

    }
    @Test
    public void GroupRadioButtonMale1(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Male";
        String agegroup="5 - 15";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String actualmalechecked=rpage.GetValesMessage();
        Assert.assertEquals(actualmalechecked,expectedradiobuttonchecked);
    }
    @Test
    public void GroupRadiobuttonFemale1(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Female";
        String agegroup="5 - 15";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String actualFemalemalechecked=rpage.GetValesMessage();
        Assert.assertEquals(actualFemalemalechecked,expectedradiobuttonchecked);
    }
    @Test
    public void GroupRadiobuttonMale2(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Male";
        String agegroup="15 - 50";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String actualmalechecked=rpage.GetValesMessage();
        Assert.assertEquals(actualmalechecked,expectedradiobuttonchecked);
    }
    @Test
    public void GroupRadiobuttonFemale2(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        String gender="Female";
        String agegroup="15 - 50";
        rpage.ClickonButton(gender);
        rpage.ClickonAgegroup(agegroup);
        rpage.ClickonGetvalues();
        String expectedradiobuttonchecked="Sex : "+gender+"\n" + "Age group: "+agegroup+"";
        String actualFemalechecked=rpage.GetValesMessage();
        Assert.assertEquals(actualFemalechecked,expectedradiobuttonchecked);

    }
}
