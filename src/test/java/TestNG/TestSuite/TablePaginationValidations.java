package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import TestNG.Page.TablePagination;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TablePaginationValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    TablePagination tfpage;
    @BeforeMethod
    public void InitObjects(){
        lpage=new LoginPage(driver);
        shomepage=new SeleniumEasyHomePage(driver);
        tfpage=new TablePagination(driver);
    }
    @Test
    public void TableFormsValidations() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Pagination");
        Assert.assertTrue(tfpage.VerifyPagination(),"Table Pagination page is not displayed");
        tfpage.GetAllHeaderColumnCount();
        int expected=7;
        int actual= tfpage.GetAllHeaderColumnCount();
        Assert.assertEquals(actual,expected);

    }
    @Test
    public void AllRowsValuesValidation() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"),"homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Pagination");
        Assert.assertTrue(tfpage.VerifyPagination(),"Table Pagination page is not displayed");
        List<String> allHeadervalues=tfpage.GetAllColumnHeadersName();
        System.out.println("all header names in table ");
        for(String names:allHeadervalues){
            System.out.println(names);
        }
        tfpage.ClickOnNextButton();
        //tfpage.GetAllRowsValues(String.valueOf(3));
        int Index=tfpage.GetColumnIndex("Table heading 3");
        System.out.println(Index);

    }
}
