package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class SimpleForm extends WebElementExtention{
    WebDriver driver;
    private String Singleinputfieldxpath="//div[text()='Single Input Field']";
    private String Entermessagexpath="//input[@id='user-message']";
    private String Showmessagexpath="//button[text()='Show Message']";
    private String EnterAxpath="//input[@id='value1']";
    private String EnterBxpath="//input[@id='value2']";
    private String Gettotalxpath="//button[text()='Get Total']";
    private String totalxpath="//span[@id='displayvalue']";
    private String getmessagexpath="//label[text()='Your Message: '] //following-sibling::span";
;    public SimpleForm(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifySingleinpufield(String fieldname){
        return VerifyWebElement(Singleinputfieldxpath);
    }
    public void Entermessage(String message){
        EnterText(Entermessagexpath,message);
    }
    public void ClickonShowMessage(){
        ClickonWebElement(Showmessagexpath);
    }
    public void EnterValue1(String value1){
        EnterText(EnterAxpath,value1);
    }
    public void EnterValue2(String value2){
        EnterText(EnterBxpath,value2);
    }
    public void ClickonGettotal(){
        ClickonWebElement(Gettotalxpath);
    }
    public String Total(){
    return GetText(totalxpath);
    }
    public String Getmessage(){
    return GetText(getmessagexpath);
    }

}
