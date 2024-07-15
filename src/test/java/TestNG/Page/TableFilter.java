package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableFilter extends WebElementExtention {
    public WebDriver driver;
    private String tablefilterxpath="//h2[text()='Table Filter Demo']";
    private String tableallcoloursxpath="//div[@class='btn-group']//button[text()='%s']";
    //private String allcolourxapth="//span[contains(@class,'pull-right ')]";
    private String greencolourxpath="//span[@class='pull-right pagado']";
    private String orangecolourxpath="//span[@class='pull-right pendiente']";
    private String redcolourxpath="//span[@class='pull-right cancelado']";
    public String allcolourxpath="//table//tbody//h4//span";
    public TableFilter(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyTablefliter(){
        return VerifyWebElement(tablefilterxpath);
    }
    public void ClickonColourButton(String colour){
        ClickonDynamicWebElement(tableallcoloursxpath,colour);
    }

    public List<String> GetallGreenColourinTable() throws Exception {
        return GetAllElementsTextByUsingFindElements(greencolourxpath);
    }
    public List<String> GetallorangeColourinTable() throws Exception {
        return GetAllElementsTextByUsingFindElements(orangecolourxpath);
    }
    public List<String> GetallRedColourinTable() throws Exception {
        return GetAllElementsTextByUsingFindElements(redcolourxpath);
    }
    public List<String> GetallColoursinTable() throws Exception {
        return GetAllElementsTextByUsingFindElements(allcolourxpath);
    }

}
