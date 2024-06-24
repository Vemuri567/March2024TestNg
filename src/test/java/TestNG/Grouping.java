package TestNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups={"Smoke"})
    public void first(){
        System.out.println("smoke");
    }
    @Test(groups={"Regression"})
    public void second(){
        System.out.println("regression");
    }
    @Test(groups={"Smoke,Regression"})
    public void third(){
        System.out.println("Smoke,Regression");
    }
}
