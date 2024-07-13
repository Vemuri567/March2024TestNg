package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TableDataSearch extends WebElementExtention {
    public WebDriver driver;
    String searchxpath="//h3[text()='Tasks']";
    String headerCountxpath="//table//thead///th";
    String headerindexxpath="//table//thead//tr//th";
    String rowvaluesXpath="//table//tbody//tr//td[%s]";
    String rowValuexpath="//table//tbody//tr";

    public TableDataSearch(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public boolean VerifySearchpage(){
        return VerifyWebElement(searchxpath);
    }
    public int ColumnIndex(String columnName) throws Exception
    {
        return GetColumnIndex(columnName,headerindexxpath);
    }
    public List<String> GetAllRowNames(String columnName) throws Exception
    {
       return GetAllRowsValues(rowvaluesXpath, columnName, headerindexxpath);
    }
    public String RowByIndex(int rowno,String columnName) throws Exception
    {
        return GetRowValueByIndex(rowno,columnName,headerindexxpath);
    }
    public int RowNo(String dependentColumn,String expectedValue) throws Exception
    {
        return GetRowNoForMatchingDependentColumnValue(dependentColumn,expectedValue,rowValuexpath,headerindexxpath);
    }

}
