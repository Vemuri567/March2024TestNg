package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableSortAndSearchValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    TableSortAndSearch tsspage;
    @BeforeMethod
    public void InitObjects() {
        lpage = new LoginPage(driver);
        shomepage = new SeleniumEasyHomePage(driver);
        tsspage=new TableSortAndSearch(driver);
    }
    @Test
    public void SelectedOptionWithTen(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifySortSearch(),"Table Sort & Search page is not displayed");
        String selectedValue=tsspage.GetValueOfSelectDropdownOption();
        int expectedNoOfRows=Integer.valueOf(selectedValue);
        System.out.println("Selected option value is:"+expectedNoOfRows);
        int actualNoOfRows=tsspage.NoOfRowsInTable();
        System.out.println("NoOf rows in a table is:"+actualNoOfRows);
        Assert.assertEquals(actualNoOfRows,expectedNoOfRows);
    }
    @Test
    public void SelectedOptionWithTwentyFive(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifySortSearch(),"Table Sort & Search page is not displayed");
        tsspage.SelectDropdownOption("25");
        String selectedValue=tsspage.GetValueOfSelectDropdownOption();
        int expectedNoOfRows=Integer.valueOf(selectedValue);
        System.out.println("Selected option value is:"+expectedNoOfRows);
        int actualNoOfRows=tsspage.NoOfRowsInTable();
        System.out.println("NoOf rows in a table is:"+actualNoOfRows);
        Assert.assertEquals(actualNoOfRows,expectedNoOfRows);
    }
    @Test
    public void SelectedOptionWithFifty(){
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifySortSearch(),"Table Sort & Search page is not displayed");
        tsspage.SelectDropdownOption("50");
        String selectedValue=tsspage.GetValueOfSelectDropdownOption();
        int expectedNoOfRows=Integer.valueOf(selectedValue);
        System.out.println("Selected option value is:"+expectedNoOfRows);
        int actualNoOfRows=tsspage.NoOfRowsInTable();
        System.out.println("NoOf rows in a table is:"+actualNoOfRows);
        //Assert.assertEquals(actualNoOfRows,expectedNoOfRows);

    }

}
