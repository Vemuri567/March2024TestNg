package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.DropDownForm;
import TestNG.Page.InputFormSubmition;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputFormSubmitionValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    InputFormSubmition ispage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        ispage=new InputFormSubmition(driver);

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



}
