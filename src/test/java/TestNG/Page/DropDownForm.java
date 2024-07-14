package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownForm extends WebElementExtention {
    WebDriver driver;
    private String Selectlistxpath = "//div[text()='Select List Demo']";
    private String daydropdownxpath = "//select[@id='select-demo']";
    private String daySelectedxpath="//p[@class='selected-value']";
    private String multiselectedxpath="//select[@id='multi-select']";
    private String firstSelectedxpath="//button[text()='First Selected']";
    private String firstSelectedOptionxpath="//p[@class='getall-selected']";
    private String getAllSelectedxpath="//button[text()='Get All Selected']";
    private String optionsSelectedxpath="//p[@class='getall-selected']";
    private String multiselectxpath="//select[@id='multi-select']";
    private String verifyOptionsSelectedxpath="//p[text()='Options selected are : %s']";

    public DropDownForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean VerifySelectList(String name) {
        return VerifyWebElement(Selectlistxpath);
    }
    public void SelectDropdownOption(String option){
        SelectDropdownOptionByVisibletext(daydropdownxpath,option);
    }
    public String SelectedOption(){
        return GetText(daySelectedxpath);
    }
    public List<String> GetDropdownList(){
        return GetDropdownitems(daydropdownxpath);
    }
    public void SelectState(String state){
        SelectDropdownOptionByVisibletext(multiselectedxpath,state);
    }
    public void ClickOnFirstSelected(){
        ClickonWebElement(firstSelectedxpath);
    }
    public String GetFirstSelectedOption(){
       return GetText(firstSelectedOptionxpath);
    }
    public void ClickOnGetAllSelected(){
        ClickonWebElement(getAllSelectedxpath);
    }
    public String OptionsSelected(){
        return GetText(optionsSelectedxpath);
    }
    public boolean VerifySelectedOption(String text)
    {
         return VerifyDynamicWebelement(verifyOptionsSelectedxpath,text);
    }
    public List<String> GetDropdownList2(){
        return GetDropdownitems(multiselectxpath);
    }



}