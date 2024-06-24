package TestNG;

import org.testng.annotations.*;

public class Annotations {
    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void aftermethod() {
        System.out.println("after method");
    }
    @Test(priority = 0,dependsOnMethods = "testcase2")
    public void testcase1(){
        System.out.println("running test -> testcase1");
    }
    @Test
    public void testcase2(){
        System.out.println("running test -> testcase2");
    }
    @Test(enabled = false)
    public void testcase3(){
        System.out.println("running test -> testcase3");
    }
    @BeforeClass
    public void beforeclass() {
        System.out.println("before class");
    }
    @AfterClass
    public void afterclass() {
        System.out.println("after class");
    }
    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void aftersuite() {
        System.out.println("after suite");
    }
    @BeforeTest
    public void beforetest() {
        System.out.println("before test");

    }
    @AfterTest
    public void aftertest() {
        System.out.println("after test");
    }
}
