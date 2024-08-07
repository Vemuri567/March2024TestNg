package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;

public class RadioButtonForm extends WebElementExtention {
    WebDriver driver;
    private String Radiobuttonxpath="//div[text()='Radio Button Demo']";
    private String Buttonxpath="//input[@name='optradio' and @value='%s']";
    private String Checkedvaluexpath="//button[text()='Get Checked value']";
    private String Genderxpath="//input[@name='gender' and @value='%s']";
    private String Agegroupxpath="//input[@value='%s']";
    private String Getvaluexpath="//button[text()='Get values']";
    private  String checkedMessageXpath="//p[text()=\"Radio button '%s' is checked\"]";
    private String getValuesmessagexpath="//p[@class='groupradiobutton']";
    public RadioButtonForm(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyRadiobutton(String button){
        return VerifyWebElement(Radiobuttonxpath);
    }
    public void ClickonRadiobutton(String button){
        ClickonDynamicWebElement(Buttonxpath,button);
    }
    public void ClickonGetCheckedValue(){
        ClickonWebElement(Checkedvaluexpath);
    }
    public String GetCheckedMessage(String gender)
    {
        return GetTextForDynamicXpath(checkedMessageXpath,gender);
    }
    public void ClickonButton(String button){
        ClickonDynamicWebElement(Genderxpath,button);
    }
    public void ClickonAgegroup(String button){
        ClickonDynamicWebElement(Agegroupxpath,button);
    }
    public void ClickonGetvalues(){
        ClickonWebElement(Getvaluexpath);
    }
    public String GetValesMessage(){

        return GetText(getValuesmessagexpath);
    }

}
