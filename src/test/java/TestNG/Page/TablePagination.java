package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class TablePagination extends WebElementExtention {
    public WebDriver driver;
    String paginationxpath="//h2[text()=' Table with Pagination Example']";
    String headerCountxpath="//table//thead//th";
    String rowsxpath="//table//tbody//tr";
    String nextPagexpath="//a[@class='page_link']";
    public TablePagination(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public boolean VerifyPagination(){
        return VerifyWebElement(paginationxpath);
    }
    public int GetAllHeaderColumnCount(){
        return HeaderColumnsCount(headerCountxpath);
    }
    public List<String> GetAllColumnHeadersName(){
        return GetAllColumnHeaderValues(headerCountxpath);
    }
    public void ClickOnNextButton(){
        ClickonWebElement(nextPagexpath);
    }

    public int GetColumnIndex(String columnName) throws Exception {
        int index=0;

        List<WebElement> headerColumns=driver.findElements(By.xpath(headerCountxpath));
        for(int i=0;i<=headerColumns.size()-1;i++)
        {
            String text=GetText(headerColumns.get(i));
            if(text.equals(columnName))
            {
                index=i+1;
                break;
            }
        }
        if(index==0)
        {
            throw new Exception(columnName+" is not available in the table");
        }
        return index+1;
    }
    public List<String> GetAllRowsValues(String columnName) throws Exception {
        int index=GetColumnIndex(columnName,headerCountxpath);
        rowsxpath=rowsxpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(rowsxpath));
        List<String> rowValues=new ArrayList<String>();
        for(WebElement row:allRowValues)
        {
            String text=GetText(row);
            rowValues.add(text);
        }

        return  rowValues;
    }


}
