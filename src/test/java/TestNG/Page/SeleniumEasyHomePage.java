package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class SeleniumEasyHomePage extends WebElementExtention {
    WebDriver driver;
    private String Navmenuitem="//li[@class='dropdown']//a[contains(text(),'%s')]";
    private String Inputformitemsxpath="//ul[@class='dropdown-menu']//a[text()='%s']";
    public SeleniumEasyHomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifySeleniumeasyHomepage(String itemname){
        return VerifyDynamicWebelement(Navmenuitem,itemname);
    }
    public void ClickonNavmenuitem(String menuitem){
        ClickonDynamicWebElement(Navmenuitem,menuitem);
   }
    public void ClickonInputformitem(String menuitem){
        ClickonDynamicWebElement(Inputformitemsxpath,menuitem);
   }
}
