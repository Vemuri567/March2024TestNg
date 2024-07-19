package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.AjaxFormSubmit;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import TestNG.Page.TableSortandSearch;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TableSortandSearchValidation extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    TableSortandSearch tsspage;

    @BeforeMethod
    public void InitObjects() {
        lpage = new LoginPage(driver);
        shomepage = new SeleniumEasyHomePage(driver);
        tsspage = new TableSortandSearch(driver);
    }
    @Test
    public void TableSortandSearch() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifyTableSortandSearch(), "Table Sort and Search Page is not displayed");
        String selectedvalue= tsspage.GetvalueofselecteddropdownItem();
        int excepted= Integer.valueOf(selectedvalue);
        System.out.println("selected option value:"+excepted);
        int actualnoofrows=tsspage.GetNumberofrows();
        System.out.println("Numberof rows in atable:" +actualnoofrows);
        Assert.assertEquals(actualnoofrows,excepted);
    }
    @Test
    public void TableSortandSearchtwentyfive() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifyTableSortandSearch(), "Table Sort and Search Page is not displayed");
        tsspage.Selectdropdownoption("25");
        String selectedvalue= tsspage.GetvalueofselecteddropdownItem();
        int excepted= Integer.valueOf(selectedvalue);
        System.out.println("selected option value:"+excepted);
        int actualnoofrows=tsspage.GetNumberofrows();
        System.out.println("Numberof rows in atable:" +actualnoofrows);
        Assert.assertEquals(actualnoofrows,excepted);
    }
    @Test
    public void TableSortandSearchFifty() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tsspage.VerifyTableSortandSearch(), "Table Sort and Search Page is not displayed");
        tsspage.Selectdropdownoption("50");
        String selectedvalue= tsspage.GetvalueofselecteddropdownItem();
        int excepted= Integer.valueOf(selectedvalue);
        System.out.println("selected option value:"+excepted);
        int actualnoofrows=tsspage.GetNumberofrows();
        System.out.println("Numberof rows in atable:" +actualnoofrows);
        Assert.assertEquals(actualnoofrows,excepted);
    }

}