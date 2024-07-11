package TestNG.Page;

import TestNG.UtilityClass.WebElementExtention;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Table extends WebElementExtention {
    WebDriver driver;
    String headersxpath="//table//thead//th";
    String rowsXpath="//table//tbody/tr";
    String rowvaluesXpath="//table//tbody/tr//td[%s]";
    public Table(WebDriver driver) {
        super(driver);
        this.driver=driver;
    }

    public int HeaderColumnsCount()
    {
        List<WebElement> headerColumns=driver.findElements(By.xpath(headersxpath));
        return headerColumns.size();
    }

    public List<String> GetAllColumnHeaderValues()
    {
        List<String> columnValues=new ArrayList<String>();
        List<WebElement> headerColumns=driver.findElements(By.xpath(headersxpath));
        for(WebElement column:headerColumns)
        {
            String text=GetText(column);
            columnValues.add(text);
        }

        return columnValues;
    }

    public int GetColumnIndex(String columnName) throws Exception {
        int index=0;

        List<WebElement> headerColumns=driver.findElements(By.xpath(headersxpath));
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
        int index=GetColumnIndex(columnName);
        rowvaluesXpath=rowvaluesXpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(rowvaluesXpath));
        List<String> rowValues=new ArrayList<String>();
        for(WebElement row:allRowValues)
        {
            String text=GetText(row);
            rowValues.add(text);
        }

        return  rowValues;
    }

    public String GetRowValueByIndex(int rowno,String columnName) throws Exception {
        int columnindex=GetColumnIndex(columnName);
        String xpath="//table[@id='task-table']//tbody/tr["+rowno+"]//td["+columnindex+"]";
        WebElement rowValue=driver.findElement(By.xpath(rowvaluesXpath));
        String text=GetText(rowValue);
        return text;
    }

    public int GetRowNoForMatchingDependentColumnValue(String dependentColumn,String expectedValue) throws Exception {
        int requiredRowNo=0;
        int index=GetColumnIndex(dependentColumn);
        rowvaluesXpath=rowvaluesXpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(rowvaluesXpath));
        for(int rowno=0;rowno<=allRowValues.size()-1;rowno++)
        {
            String text=GetText(allRowValues.get(rowno));
            if(text.equals(expectedValue))
            {
                requiredRowNo=rowno+1;
                break;
            }

        }
        return  requiredRowNo;
    }

    public List<String> GetAllRowValuesForMatchingDependentColumnValue(String columnName,String dependentColumn,String expectedValue) throws Exception {
        List<Integer> requiredRowNos=new ArrayList<Integer>();
        int index=GetColumnIndex(dependentColumn);
        rowvaluesXpath=rowvaluesXpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(rowvaluesXpath));
        for(int rowno=0;rowno<=allRowValues.size()-1;rowno++)
        {
            String text=GetText(allRowValues.get(rowno));
            if(text.equals(expectedValue))
            {
                requiredRowNos.add(rowno+1);
            }

        }
        List<String> allRowValuesForMatchingColumn=new ArrayList<String>();
        int actualColumnIndex=GetColumnIndex(columnName);
        for(int i=0;i<=requiredRowNos.size()-1;i++)
        {
            String xpath="//table[@id='task-table']//tbody/tr["+requiredRowNos.get(i)+"]//td["+actualColumnIndex+"]";
            String text=driver.findElement(By.xpath(xpath)).getText();
            allRowValuesForMatchingColumn.add(text);
        }
        return allRowValuesForMatchingColumn;
    }
}
