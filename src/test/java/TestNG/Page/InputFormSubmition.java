package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class InputFormSubmition extends WebElementExtention {
    WebDriver driver;
    private String inputFormWithValidationxpath="//h2[text()='Input form with validations']";
    private String firstnamexpath="//input[@name='first_name']";
    private String lastnamexpath="//input[@name='last_name']";
    private String emailxpath="//input[@name='email']";
    private String phonexpath="//input[@name='phone']";
    private String addressxpath="//input[@name='address']";
    private String cityxpath="//input[@name='city']";
    private String statexpath="//select[@name='state']";
    private String zipxpath="//input[@name='zip']";
    private String websitexpath="//input[@name='website']";
    private String hostingxpath="//input[@name='hosting']";
    private String projectdiscriptionxpath="//textarea[@name='comment']";
    private String sendbuttonxpath="//button[text()='Send ']";
    public InputFormSubmition(WebDriver driver){
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyInputformSubmition(String text)
    {
        return VerifyWebElement(inputFormWithValidationxpath);

    }
    public void FirstnName(String name)
    {
        EnterText(firstnamexpath,name);
    }
    public void LastName(String name)
    {
        EnterText(lastnamexpath,name);
    }
    public void EmailAdd(String email)
    {
        EnterText(emailxpath,email);
    }
    public void Phone(String phone)
    {
        EnterText(phonexpath,phone);
    }
    public void Address(String address)
    {
        EnterText(addressxpath,address);
    }
    public void City(String city)
    {
        EnterText(cityxpath,city);
    }
    public void SelectState(String state){
        SelectDropdownOptionByVisibletext(statexpath,state);
    }
    public void ZipCode(String zipcode)
    {
        EnterDynamicText(zipxpath,zipcode);
    }
    public void WebsiteorDomaineName(String domain)
    {
        EnterDynamicText(websitexpath,domain);
    }
    public void HostingRadiobutton()
    {
        ClickonWebElement(hostingxpath);
    }
    public void ProjectDescription(String project)
    {
        EnterDynamicText(projectdiscriptionxpath,project);
    }
    public void ClickOnSendButton()
    {
        ClickonWebElement(sendbuttonxpath);
    }
}
