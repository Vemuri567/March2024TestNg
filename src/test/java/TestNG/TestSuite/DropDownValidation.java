package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import java.util.List;

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
        String day="Monday";
        dpage.SelectDropdownOption(day);
        //String expectedmessage="Day selected :- "+day+"";
        String actualmessage=dpage.SelectedOption();
        Assert.assertTrue(actualmessage.contains(day));

    }
    @Test
    public void GetAllOptions(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Select Dropdown List");
        Assert.assertTrue(dpage.VerifySelectList("Select List Demo"),"Dropdown page is not displayed");
        List<String> allOptions=dpage.GetDropdownList();
        System.out.println("No.of days present in list is "+allOptions.size());
        for(String option:allOptions)
        {
            System.out.println(option);
        }

    }
    @Test
    public void MultiSelectListValidation(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Select Dropdown List");
        Assert.assertTrue(dpage.VerifySelectList("Select List Demo"),"Dropdown page is not displayed");
        String state="California";
        dpage.SelectState(state);
        dpage.ClickOnFirstSelected();
        //String expectedSelectState="First selected option is : "+state+"";
        String actualSelectState=dpage.GetFirstSelectedOption();
        Assert.assertTrue(actualSelectState.contains(state));

    }
    @Test
    public void MultiSelectListValidation1(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Select Dropdown List");
        Assert.assertTrue(dpage.VerifySelectList("Select List Demo"),"Dropdown page is not displayed");
        String state="Texas";
        dpage.SelectState(state);
        dpage.ClickOnGetAllSelected();
        //String expectedGetAllSelectedstate="Options selected are : "+state+"";
        String actualGetAllSelectedstate=dpage.OptionsSelected();
        Assert.assertTrue(actualGetAllSelectedstate.contains(state));
    }
    @Test
    public void AllDropdownItems(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Input Forms");
        shomepage.ClickonInputformitem("Select Dropdown List");
        Assert.assertTrue(dpage.VerifySelectList("Select List Demo"),"Dropdown page is not displayed");
        List<String> alloptions=dpage.GetDropdownList2();
        System.out.println("No.of states present in list is "+dpage.GetDropdownList2().size());
        for(String option:alloptions)
        {
            System.out.println(option);
        }

    }
}
