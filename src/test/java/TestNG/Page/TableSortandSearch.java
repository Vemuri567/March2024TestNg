package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.WebDriver;

public class TableSortandSearch extends WebElementExtention {
    WebDriver driver;
    private String sortpagexapth="//h2[text()='Table Sort And Search Demo']";
    private String showbuttonxpath="//select[@name='example_length']";
    private String rowsxapth="//table//tbody//tr";
    public TableSortandSearch(WebDriver driver) {
        super(driver);
         this.driver=driver;
    }
    public boolean VerifyTableSortandSearch(){
        return  VerifyWebElement(sortpagexapth);
    }
    public String GetvalueofselecteddropdownItem(){
        return  GetselectdropdownItem(showbuttonxpath);
    }
    public int GetNumberofrows(){
        return  AllRowsCount(rowsxapth);
    }
    public void Selectdropdownoption(String option){
        SelectDropdownOptionByVisibletext(showbuttonxpath,option);
    }




}
