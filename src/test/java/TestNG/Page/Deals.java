package TestNG.Page;

import TestNG.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Deals extends BaseClass {
    WebDriver driver;
        private String dealspagexpath="//span[text()='Deals'and @class='selectable ']";
    private String dealscheckboxxpath="//input[@type='checkbox'";
    public Deals(WebDriver driver){
        this.driver=driver;
    }
    public void Dealspage(){
        driver.findElement(By.xpath(dealspagexpath)).click();
    }

}
