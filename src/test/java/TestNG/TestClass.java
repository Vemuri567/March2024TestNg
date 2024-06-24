package TestNG;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void method1(){
        someclasstotest obj=new someclasstotest();
        int result=obj.addition(1,3);
        System.out.println(result);
        System.out.println("hi how are you");
    }
    @Test
    public void method2(){
        System.out.println("what are you doing");
    }
    @Test
    public void method3(){
        System.out.println("where are you");
    }
}