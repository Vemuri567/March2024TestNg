package TestNG.TestSuite;

import TestNG.BaseClass;
import TestNG.Page.DropDownForm;
import TestNG.Page.LoginPage;
import TestNG.Page.SeleniumEasyHomePage;
import TestNG.Page.TableFilter;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableFilterValidations extends BaseClass {
    LoginPage lpage;
    SeleniumEasyHomePage shomepage;
    TableFilter tfpage;

    @BeforeMethod
    public void InitObjects() {
        lpage = new LoginPage(driver);
        shomepage = new SeleniumEasyHomePage(driver);
        tfpage = new TableFilter(driver);
    }

    @Test
    public void TableFilterGreencolourValidation() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Filter ");
        Assert.assertTrue(tfpage.VerifyTablefliter(), "Table Filter page is not displayed");
        tfpage.ClickonColourButton("Green");
        List<String> colours = tfpage.GetallGreenColourinTable();
        Assert.assertTrue(tfpage.AllItemsAreEqual(colours, "(Green)"), "actual colours are:" + colours);

    }

    @Test
    public void TableFilterOrangeColourvalidation() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Filter ");
        Assert.assertTrue(tfpage.VerifyTablefliter(), "Table Filter page is not displayed");
        tfpage.ClickonColourButton("Orange");
        List<String> colours = tfpage.GetallorangeColourinTable();
        Assert.assertTrue(tfpage.AllItemsAreEqual(colours, "(Orange)"), "actual colours are:" + colours);
    }

    @Test
    public void TableFilterRedColourvalidation() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Filter ");
        Assert.assertTrue(tfpage.VerifyTablefliter(), "Table Filter page is not displayed");
        tfpage.ClickonColourButton("Red");
        List<String> colours = tfpage.GetallRedColourinTable();
        Assert.assertTrue(tfpage.AllItemsAreEqual(colours, "(Red)"), "actual colours are:" + colours);

    }

    @Test
    public void TableFilterAllColoursvalidation() throws Exception {
        lpage.NavigateToUrl("https://demo.seleniumeasy.com/");
        Assert.assertTrue(shomepage.VerifySeleniumeasyHomepage("Input Forms"), "homepage is not displayed");
        shomepage.ClickonNavmenuitem("Table");
        shomepage.ClickonTableitem("Table Filter ");
        Assert.assertTrue(tfpage.VerifyTablefliter(), "Table Filter page is not displayed");
        tfpage.ClickonColourButton("All");
        List<String> colours = tfpage.GetallColoursinTable();
        Assert.assertTrue(colours.contains("(Green)"));
        Assert.assertTrue(colours.contains("(Orange)"));
        Assert.assertTrue(colours.contains("(Red)"));
    }
}

