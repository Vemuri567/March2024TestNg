package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class Negitiveinputform extends WebElementExtention {
    WebDriver driver;

    private String Firstnamexpath="//input[@name='first_name']";
   // private String Firstnamecrossxpath="//i[@class='form-control-feedback bv-icon-input-group glyphicon glyphicon-remove']";
private String Firstnamevalidationxpath="//small[@data-bv-result='INVALID' and  @data-bv-validator='stringLength']";
private String Lastnamexpath="//input[@name='last_name']";
    private String Lastnamevalidationxpath="//small[@data-bv-result='INVALID' and  @data-bv-validator='stringLength']";
private String Emailxpath="//input[@name='email']";
private String Emailvalidationxpath="//small[@data-bv-result='INVALID' and  @data-bv-validator='emailAddress']";
private String Phonexpath="//input[@name='phone']";
private String Phonevalidationxpath="//small[@data-bv-result='INVALID' and  @data-bv-validator='phone']";
public Negitiveinputform(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public void Firstname(String name)
    {
    EnterText(Firstnamexpath, name);
    }
    /*public void Firstnamecross(String xpath)
    {
ClickonWebElement(Firstnamecrossxpath);
    }*/

    public void ClickonFirstnamevalidation()
    {
      ClickonWebElement(Firstnamevalidationxpath);
    }
    public String Firstnamevalidation()
    {
        return GetText(Firstnamevalidationxpath);
    }
    public void Lastname(String name)
    {
        EnterText(Lastnamexpath, name);
    }
    public void ClickonLastnamevalidation()
    {
        ClickonWebElement(Lastnamevalidationxpath);
    }
    public boolean Lastnamevalidation(String xpath)
    {
        return VerifyWebElement(Lastnamevalidationxpath);
    }
    public void Email(String email)
    {
        EnterText(Emailxpath, email);
    }
    public void ClickonEmailvalidation()
    {
        ClickonWebElement(Emailvalidationxpath);
    }
    public String Emailvalidation()
    {
        return GetText(Emailvalidationxpath);
    }
    public void Phone(String phone)
    {
        EnterText(Phonexpath, phone);
    }
    public void Clickonphonevalidation()
    {
        ClickonWebElement(Phonevalidationxpath);
    }
    public String Phonevalidation()
    {
        return GetText(Phonevalidationxpath);
    }
    
}
