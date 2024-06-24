package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownForm extends WebElementExtention {
    WebDriver driver;
    private String Selectlistxpath = "//div[text()='Select List Demo']";
    private String Daydropdownxpath = "//select[@id='select-demo']";

    public DropDownForm(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean VerifySelectList(String name) {
        return VerifyWebElement(Selectlistxpath);
    }

   /* public WebElement SelectaDay(String day) {
        WebElement drpCountry = new Select(Daydropdownxpath);


    }*/
}