package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class AjaxFormSubmit extends WebElementExtention {
    WebDriver driver;
    private String ajaxformxpath="//div[text()='Ajax Form']";
    private String namexpath="//input[@id='title']";
    private String commentxpath="//textarea[@id='description']";
    private String submitxpath="//input[@id='btn-submit']";
    private String submittedxpath="//div[@id='submit-control']";
    public AjaxFormSubmit(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyAjaxForm(String element){
        return VerifyWebElement(ajaxformxpath);
    }
    public void EnterName(String name){
        EnterText(namexpath,name);
    }
    public void EnterDiscription(String description){
        EnterText(commentxpath,description);
    }
    public void ClickOnSubmit(){
        ClickonWebElement(submitxpath);
    }
    public boolean GetSubmittedmessage(){
        return VerifyWebElement(submittedxpath);
    }
}
