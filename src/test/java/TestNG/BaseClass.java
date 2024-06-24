package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public WebDriver initedriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\March2024Selenium Project\\Selenium\\src\\test\\resources\\ChromeDriver\\ChromeDriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
    /*@AfterClass
    public void Afterclass(){
        driver.close();
    }*/
}
