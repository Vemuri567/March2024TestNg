package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class CheckboxForm extends WebElementExtention {
    WebDriver driver;
    private String Checkboxxpath="//input[@id='isAgeSelected']";
    private String Inputformitemsxpath="//ul[@class='dropdown-menu']//a[text()='%s']";
    private String Singlecheckboxxpath="//div[text()='Single Checkbox Demo']";
    private String Checkallxpath="//input[@value='Check All']";
    private String unCheckallxpath="//input[@value='Uncheck All']";
    private String SuccessMessagexpath="//div[text()='Success - Check box is checked']";
    private  String defaultCheckedxpath="//input[@checked and not(@disabled)]";
    private String Optionsxpath="//label[text()='%s']//input";
    public CheckboxForm(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifySingleCheckboxDemo(String itemname){
        return VerifyWebElement(Singlecheckboxxpath);
    }
    public void ClickonCheckbox(){
        ClickonWebElement(Checkboxxpath);
    }
    public void ClickonCheckAll(){
        ClickonWebElement(Checkallxpath);
    }
    public boolean VerifyUnCheckAll()
    {
        return VerifyWebElement(unCheckallxpath);
    }

    public void ClickOnUncheckAll()
    {
        ClickonWebElement(unCheckallxpath);
    }
    public boolean VerifyCheckAll()
    {
        return VerifyWebElement(Checkallxpath);
    }
    public boolean VerifyDefaultChecked()
    {
        return VerifyWebElement(defaultCheckedxpath);
    }
    public boolean VerifySuccessCheckbox()
    {
        return VerifyWebElement(SuccessMessagexpath);
    }
    public void SelectOption(String option){
        ClickonDynamicWebElement(Optionsxpath,option);
    }
}
