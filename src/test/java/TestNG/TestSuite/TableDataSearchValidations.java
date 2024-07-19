package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.*;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableDataSearchValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    Table tpage;
    TableDataSearch tdpage;

    @BeforeMethod
    public void InitObjects() {
        lpage = new LoginPage(driver);
        shomepage = new SeleniumEasyHomePage(driver);
        tpage = new Table(driver);
        tdpage = new TableDataSearch(driver);
    }

    @Test
    public void ValidateAllColumnHeaders() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        /*int expected=3;
        int actual=tdpage.ColumnIndex("Assignee");
        int Index=tdpage.ColumnIndex("Assignee");
        System.out.println("Index of Assignee is :"+Index);
        Assert.assertEquals(actual,expected);*/
        List<String> expectedColumnHeaders = new ArrayList<String>(Arrays.asList("#", "Task", "Assignee", "Status"));
        List<String> actualColumnHeaders = tpage.GetAllColumnHeaderValues();
        Assert.assertTrue(expectedColumnHeaders.equals(actualColumnHeaders), "expected coloumn headers:" + expectedColumnHeaders + " and actual column headers:" + actualColumnHeaders);
    }

    @Test
    public void GetAllRowValuesforspecificcolumn() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        List<String> rows = tdpage.GetAllRowNames("Task");
        for (String values : rows) {
            System.out.println(values);
        }

    }

    @Test
    public void VerifyAscendingorderforspecificcolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Name");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.VerifylistAscendingorder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyDescendingorderforspecificcolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Name");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Name");
        System.out.println("total rows:" + rows.size());
        boolean isdescendingorder = tpage.VerifyDescendingorder(rows);
        Assert.assertTrue(isdescendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyDescendingorderforspecificpositioncolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Position");
        tpage.Clickoncolumnheader("Position");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Position");
        System.out.println("total rows:" + rows.size());
        boolean isdescendingorder = tpage.VerifyDescendingorder(rows);
        Assert.assertTrue(isdescendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyAscendingorderforspecificpositioncolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Position");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Position");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.VerifylistAscendingorder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }

    @Test
    public void Verifyofficenameserachbox() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.searchbox("New York");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Office");
        Assert.assertTrue(tpage.AllItemsAreEqual(rows, "New York"), "atualofficecolumnvalues:" + rows);
    }

    @Test
    public void VerifyAscendingorderforspecificOfficecolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Office");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Office");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.VerifylistAscendingorder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyDescendingorderforspecificOfficecolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Office");
        tpage.Clickoncolumnheader("Office");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Office");
        System.out.println("total rows:" + rows.size());
        boolean isdescendingorder = tpage.VerifyDescendingorder(rows);
        Assert.assertTrue(isdescendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyAscendingorderforspecificAgecolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Age");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Age");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.VerifylistAscendingorder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyDescendingorderforspecificAgecolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Age");
        tpage.Clickoncolumnheader("Age");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Age");
        System.out.println("total rows:" + rows.size());
        boolean isdescendingorder = tpage.VerifyDescendingorder(rows);
        Assert.assertTrue(isdescendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyAscendingorderforspecificStartDatecolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Start date");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Start date");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.DatesAreInAscendingOrder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }

    @Test
    public void VerifyAscendingorderforspecificSalarycolumnvalues() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Sort & Search");
        Assert.assertTrue(tpage.Verifysortedtablepage(), "Table Data Search page is not displayed");
        tpage.Clickoncolumnheader("Salary");
        List<String> rows = tpage.GetAllRowsValuesfortablesort("Salary");
        System.out.println("total rows:" + rows.size());
        boolean isascendingorder = tpage.VerifySalariesAreInAscendingOrder(rows);
        Assert.assertTrue(isascendingorder, "actual values :" + rows);
    }


    @Test
    public void GetSpecificValueInTable() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        String rowbyIndex = tdpage.RowByIndex(5, "Assignee");
        System.out.println("value of the 5th row and Assignee column is :" + rowbyIndex);
    }

    @Test
    public void BasedonStatusAssigneeName() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        List<String> rowvalues = tpage.GetAllRowValuesForMatchingDependentColumnValue("Assignee", "Status", "in progress");
        //System.out.println(rowvalues);
        for (String row : rowvalues) {
            System.out.println(row);
        }
        List<String> actual = new ArrayList<String>(rowvalues);
        List<String> excepted = new ArrayList<String>(Arrays.asList("John Smith", "Emily John", "Kilgore Trout"));
        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void GetIndexBasedOnDependentCOlumn() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        int index = tpage.GetRowNoForMatchingDependentColumnValue("Status", "completed");
        System.out.println(index);
        int excepted = 2;
        Assert.assertEquals(index, excepted);
    }

    @Test
    public void GetRowvalueByIndex() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Data Search");
        Assert.assertTrue(tdpage.VerifySearchpage(), "Table Data Search page is not displayed");
        String value = tpage.GetRowValueByIndex(2, "Task");
        System.out.println(value);
        String expected = "Landing Page";
        Assert.assertEquals(value, expected);
    }
}

