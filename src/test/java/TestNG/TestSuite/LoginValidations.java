package TestNG.TestSuite;
import TestNG.BaseClass;
import TestNG.Page.Deals;
import TestNG.Page.HomePage;
import TestNG.Page.LoginPage;
import TestNG.Page.Contacts;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginValidations extends BaseClass {
        LoginPage lpage;
        HomePage hpage;
        Contacts cpage;

        @BeforeMethod
        public void initobjects(){

            lpage =new LoginPage(driver);
            hpage=new HomePage(driver);
            cpage=new Contacts(driver);
        }

        @Test
        public void LoginScenarioValidation() throws InterruptedException {
            lpage.NavigateToUrl("https://www.freecrm.com/");
            lpage.ClickOnLoginLink();
            lpage.EnterEmail("naveenchowdaryvemuri@gmail.com");
            lpage.EnterPassword("Naveen@143");
            lpage.LogIn();
            HomePage hpage=lpage.LogIn();
            String actualLogedinUser=hpage.VerifyUserName();
            Assert.assertEquals(actualLogedinUser,"Vemuri Naveen");
            hpage.ClickonContacts();
            Contacts cpage=hpage.ClickonContacts();
            lpage.CurrentUrl("https://www.amazon.in/");
            driver.navigate().back();
            Deals dpage=hpage.ClickonDeals();
            dpage.Dealspage();





        }
    }

