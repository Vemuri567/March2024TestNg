import org.openqa.selenium.By;
import org.openqa.selenium .WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\March2024Selenium Project\\Selenium\\src\\test\\resources\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.quit();
        driver.get("https://www.freecrm.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        WebElement about= driver.findElement(By.xpath("//a[@href='about.html']"));
        if(about.isDisplayed()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        about.click();
        driver.close();
    }
}

