package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputFormSubmitionValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    InputFormSubmition ispage;
    Negitiveinputform npage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        ispage=new InputFormSubmition(driver);
        npage=new Negitiveinputform(driver);


    }
    @Test
    public void InputFormSubmitionValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Input Form Submit");
        Assert.assertTrue(ispage.VerifyInputformSubmition("Input form with validations"),"Input Form Submit page is not displayed");
        ispage.FirstnName("Bhavani");
        ispage.LastName("Chowdary");
        ispage.EmailAdd("bhavanibandaru13@gmail.com");
        ispage.Phone("9640514608");
        ispage.Address("5-265 Buddaram");
        ispage.City("Khammam");
        ispage.SelectState("New York");
        ispage.ZipCode("10005");
        ispage.WebsiteorDomaineName("Yes");
        ispage.HostingRadiobutton();
        ispage.ProjectDescription("What is the work status");
        ispage.ClickOnSendButton();
    }
    @Test
    public void Negitiveinputformvalidation()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Input Form Submit");
        Assert.assertTrue(ispage.VerifyInputformSubmition("Input form with validations"),"Input Form Submit page is not displayed");
        npage.Firstname("s");
        npage.ClickonFirstnamevalidation();
        npage.Firstnamevalidation();
        String actualmessage=npage.Firstnamevalidation();
        String expectedmessage="Please enter more than 2 characters";
        Assert.assertEquals(actualmessage,expectedmessage);


    }

    @Test
    public void Lastnamenegitivescenario()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Input Form Submit");
        Assert.assertTrue(ispage.VerifyInputformSubmition("Input form with validations"),"Input Form Submit page is not displayed");
        npage.Lastname("a");
        npage.ClickonLastnamevalidation();
        //npage.Lastnamevalidation();
       /* String actualmessage=npage.Firstnamevalidation();
        String expectedmessage="Please enter more than 2 characters";*/
        Assert.assertTrue(npage.Lastnamevalidation("Please enter more than 2 characters"),"page not displayed");

    }
    @Test
    public void Emailnegitivesc3nario()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Input Form Submit");
        Assert.assertTrue(ispage.VerifyInputformSubmition("Input form with validations"),"Input Form Submit page is not displayed");
        npage.Email("sss");
        npage.ClickonEmailvalidation();
        npage.Emailvalidation();
        String actualmessage=npage.Emailvalidation();
        String expectedmessage="Please supply a valid email address";
        Assert.assertEquals(actualmessage,expectedmessage);

    }
    @Test
    public void Phonenegtivescenario()
    {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Input Form Submit");
        Assert.assertTrue(ispage.VerifyInputformSubmition("Input form with validations"),"Input Form Submit page is not displayed");
        npage.Phone("666");
        npage.Clickonphonevalidation();
        npage.Phonevalidation();
        String actualmessage=npage.Phonevalidation();
        String expectedmessage="Please supply a vaild phone number with area code";
        Assert.assertEquals(actualmessage,expectedmessage);

    }
}
