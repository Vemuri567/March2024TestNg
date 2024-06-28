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
        rpage.ClickonButton("Male");
        rpage.ClickonAgegroup("0 - 5");
        rpage.ClickonGetvalues();
        //String acualmaleChecked=rpage.GetValesMessage("Male");
       // Assert.assertEquals("Radio button 'Male'and age group '0-5' is checked",acualmaleChecked);


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
       // Assert.assertEquals(actualradiobuttonchecked,expectedradiobuttonchecked);
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
        rpage.ClickonButton("Male");
        rpage.ClickonAgegroup("5 - 15");
        rpage.ClickonGetvalues();
       // String actualmalechecked=rpage.GetValesMessage("Male,5-15");
       // Assert.assertEquals("Radio button 'Male'and age group '5-15' is checked",actualmalechecked);
    }
    @Test
    public void GroupRadiobuttonFemale1(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        rpage.ClickonButton("Female");
        rpage.ClickonAgegroup("5 - 15");
        rpage.ClickonGetvalues();
       // String actualFemalemalechecked=rpage.GetValesMessage("Male");
        //Assert.assertEquals("Radio button 'Female'and age group '5-15' is checked",actualFemalemalechecked);
    }
    @Test
    public void GroupRadiobuttonMale2(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        rpage.ClickonButton("Male");
        rpage.ClickonAgegroup("15 - 50");
        rpage.ClickonGetvalues();
       // String actualmalechecked=rpage.GetValesMessage("Male");
        //Assert.assertEquals("Radio button 'Female'and age group '5-15' is checked",actualmalechecked);
    }
    @Test
    public void GroupRadiobuttonFemale2(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Radio Buttons Demo");
        Assert.assertTrue(rpage.VerifyRadiobutton("Radio Button Demo"),"Radio button" + " page is not displyed");
        rpage.ClickonButton("Female");
        rpage.ClickonAgegroup("15 - 50");
        rpage.ClickonGetvalues();
       // String actualFemalechecked=rpage.GetValesMessage("Female:15-50");
       // Assert.assertEquals("Radio button 'Female'and age group '15-50' is checked",actualFemalechecked);

    }
}
