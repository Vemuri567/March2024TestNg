package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TableSortAndSearch extends WebElementExtention {
    public WebDriver driver;
    String verifySortSearchXpath="//h2[text()='Table Sort And Search Demo']";
    String selectedOptinXpath="//div[@class='dataTables_length']//select//option[@value]";
    String dropdownXpath="//select[@name='example_length']";
    String rowsXpath="//table//tbody//tr";
    public TableSortAndSearch(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public boolean VerifySortSearch(){
        return VerifyWebElement(verifySortSearchXpath);
    }
    public String GetValueOfSelectDropdownOption(){
        return GetSelectedDropdownItem(dropdownXpath);
    }
    public int NoOfRowsInTable(){
        return GetAllRowsCount(rowsXpath);
    }
    public void SelectDropdownOption(String option){
        SelectDropdownOptionByVisibletext(dropdownXpath,option);
    }
}
