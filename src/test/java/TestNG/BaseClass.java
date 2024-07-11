package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseClass {
    public WebDriver driver;
    @BeforeClass
    public WebDriver initDriver() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "D:\\March2024Testng\\March2024TestNg\\src\\test\\resources\\ChromeDriver\\ChromeDriver.exe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    @AfterClass
    public void Afterclass(){
        driver.quit();
    }
}
