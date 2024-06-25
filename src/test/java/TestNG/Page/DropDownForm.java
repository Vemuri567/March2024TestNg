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
    public List<String> GetDropdownitems(){
        WebElement testDropDown = driver.findElement(By.id("testingDropdown"));
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String text=alloptions.get(i).getText();
            items.add(text);
        }
        return items;
    }


}