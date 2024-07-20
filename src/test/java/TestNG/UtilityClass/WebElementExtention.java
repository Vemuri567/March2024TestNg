package TestNG.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;

public class WebElementExtention {
    WebDriver driver;
    public WebElementExtention(WebDriver driver){
        this.driver=driver;
    }
    public WebElement Getwebelement(String xpath){
        return driver.findElement(By.xpath(xpath));
    }
    public List<WebElement> GetAllWebElements(String xpath) {
        return driver.findElements(By.xpath(xpath));
    }
    public List<WebElement> GetAllDynamicWebElements(String xpath, String text) {
        xpath=xpath.replace("%s",text);
        return driver.findElements(By.xpath(xpath));
    }
    public boolean VerifyWebElement(String xpath){
        return Getwebelement(xpath).isDisplayed();
    }
    public boolean VerifyDynamicWebelement(String xpath,String text){
        return GetDynamicWebelement(xpath,text).isDisplayed();
    }
    public void ClearText(String xpath){
        Getwebelement(xpath).click();
    }


    public void ClickonWebElement(String xpath)
    {
        Getwebelement(xpath).click();


    }
    public String GetText(String xpath){
        return Getwebelement(xpath).getText();
    }
    public List<String> GetAllElementsTextByUsingFindElements(String xpath) throws Exception {
       List<WebElement> elements= GetAllWebElements(xpath);
       //to verify count after calling getall webelements
        //find elements method will return list of web elements if there is no elements in the application we will get count zero
        if(elements.size()==0){
            throw new Exception("webelement is not identified in the application for given xpath:"+ xpath);
        }

       List<String> list= new ArrayList<>();
       for(WebElement ele:elements){
           list.add(ele.getText());
       }
        return list;
    }
    public List<String> GetAllDynamicwebElementsTextByUsingFindElements(String xpath ,String text) throws Exception {
        List<WebElement> elements= GetAllDynamicWebElements(xpath, text);
        //to verify count after calling getall webelements
        //find elements method will return list of web elements if there is no elements in the application we will get count zero
        if(elements.size()==0){
            throw new Exception("webelement is not identified in the application for given xpath:"+ xpath);
        }

        List<String> list= new ArrayList<>();
        for(WebElement ele:elements){
            list.add(ele.getText());
        }
        return list;
    }
    public String GetText(WebElement element){
        return element.getText();
    }
    public String GetTextForDynamicXpath(String xpath,String text){
        return GetDynamicWebelement(xpath,text).getText();
    }
    public void ClickonDynamicWebElement(String xpath,String text){
        GetDynamicWebelement(xpath,text).click();
    }

    public void EnterText(String xpath,String text){
        Getwebelement(xpath).sendKeys(text);
    }
    public void EnterDynamicText(String xpath,String text){
        GetDynamicWebelement(xpath,text).sendKeys(text);
    }
    public WebElement GetDynamicWebelement(String xpath,String text){
        xpath=xpath.replace("%s",text);
        return driver.findElement(By.xpath(xpath));
    }
    public void SelectDropdownOptionByVisibletext(String xpath,String option){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText(option);
    }
    public void SelectDropdownOptionByValue(String xpath,String value){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByValue(value);
    }
    public void SelectDropdownOptionByIndex(String xpath, int index){
        WebElement testDropDown =Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(index);
    }
    public String GetSelectedDropdownItem(String xpath){
        Select dropdown = new Select(Getwebelement(xpath));
        WebElement selectedOption = dropdown.getFirstSelectedOption();
        String selectedText = selectedOption.getText();
        return selectedText;
    }
    public List<String> GetDropdownitems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String text=alloptions.get(i).getText();
            items.add(text);
        }
        return items;
    }

    public List<String> GetDropdownDiasbleditems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String disabled=alloptions.get(i).getAttribute("aria-disabled");
            if(disabled.equals("true")){
                String text=alloptions.get(i).getText();
                items.add(text);
            }

        }
        return items;
    }


    public List<String> GetDropdownEnableditems(String xpath){
        WebElement testDropDown = Getwebelement(xpath);
        Select dropdown = new Select(testDropDown);
        List<WebElement> alloptions=dropdown.getOptions();
        List<String> items=new ArrayList<>();
        for(int i=0;i<=alloptions.size()-1;i++){
            String disabled=alloptions.get(i).getAttribute("aria-disabled");
            if(disabled.equals("")){
                String text=alloptions.get(i).getText();
                items.add(text);
            }

        }
        return items;
    }

    public void ClearInputFields(String xpath){
        Getwebelement(xpath).clear();
    }

    public void PressControlFromKeyaboard()
    {
        Actions builder=new Actions(driver);
        builder.sendKeys(Keys.CONTROL);
    }
    public void PressEnterFromKeyaboard()
    {
        Actions builder=new Actions(driver);
        builder.sendKeys(Keys.ENTER);
    }
    public String GetAttributevalue(String xpath,String name){
        return Getwebelement(xpath).getAttribute(name);
    }
    public String GetAttributeValue(WebElement element, String name){
        return element.getAttribute(name);
    }
    public int HeaderColumnsCount(String headersxpath)
    {
        List<WebElement> headerColumns=driver.findElements(By.xpath(headersxpath));
        return headerColumns.size();
    }
    public int GetAllRowsCount(String xpath){
        List<WebElement> rows=driver.findElements(By.xpath(xpath));
        return rows.size();
    }
    public List<String> GetAllColumnHeaderValues(String headersxpath)
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
    public int GetColumnIndex(String columnName,String headersxpath) throws Exception {
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
        return index;
    }
    public List<String> GetAllRowsValues(String xpath,String columnName,String headersxpath) throws Exception {
        int index=GetColumnIndex(columnName,headersxpath);
        xpath=xpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(xpath));
        List<String> rowValues=new ArrayList<String>();
        for(WebElement row:allRowValues)
        {
            String text=GetText(row);
            rowValues.add(text);
        }

        return  rowValues;
    }
    public String GetRowValueByIndex(int rowno,String columnName,String headersxpath) throws Exception {
        int columnindex=GetColumnIndex(columnName,headersxpath);
        String xpath="//table[@id='task-table']//tbody/tr["+rowno+"]//td["+columnindex+"]";
        WebElement rowValue=driver.findElement(By.xpath(xpath));
        String text=GetText(rowValue);
        return text;
    }
    public int GetRowNoForMatchingDependentColumnValue(String dependentColumn,String expectedValue,String xpath,String headersxpath) throws Exception {
        int requiredRowNo=0;
        int index=GetColumnIndex(dependentColumn,headersxpath);
        xpath=xpath.replace("%s",String.valueOf(index));
        List<WebElement> allRowValues=driver.findElements(By.xpath(xpath));
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
public boolean VerifylistAscendingorder(List<String> list)
{
    boolean isascendingorder=true;
    for (int i=0;i<= list.size()-2;i++)
    {
        if(list.get(i).compareTo(list.get(i+1))>0)
        {
            isascendingorder=false;
            break;
        }
    }
    //second way to verify ascending order
   /* List<String> sortedlist=new ArrayList<>(list);
    Collections.sort(sortedlist);
    return sortedlist.equals(list);*/

    return isascendingorder;
}
public boolean VerifyDescendingorder(List<String> list)
{
    boolean isdescendingorder=true;
    for (int i=0;i<= list.size()-2;i++)
    {
        if(list.get(i).compareTo(list.get(i+1))<0)
        {
            isdescendingorder=false;
            break;
        }
    }

    //second way to verify descending order
    /*List<String> sortedlist=new ArrayList<>(list);
    Collections.sort(sortedlist);
    Collections.reverse(sortedlist);
    return sortedlist.equals(list);*/

    return isdescendingorder;
}

public boolean AllItemsAreEqual(List<String> items,String compareItemName){
     for(int i=0;i<=items.size()-1;i++){
         if(!items.get(i).equals(compareItemName)){
             return false;
         }
     }
     return true;
     //second way to verify alllistitems are equal or not
    //return items.stream().allMatch(item-> Objects.equals(item,compareItemName));
}

}